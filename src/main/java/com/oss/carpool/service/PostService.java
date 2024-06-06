package com.oss.carpool.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.oss.carpool.domain.Post;
import com.oss.carpool.domain.User;
import com.oss.carpool.dto.AddPostRequestDTO;
import com.oss.carpool.repository.PostRepository;
import com.oss.carpool.repository.UserRepository;

@Service
public class PostService {

	private PostRepository postRepository;
	private UserRepository userRepository;

	@Autowired
	public PostService(PostRepository postRepository, UserRepository userRepository) {
		this.postRepository = postRepository;
		this.userRepository = userRepository;
	}
	
	public Post addNewPost(AddPostRequestDTO dto) {
		User author = userRepository.findById(dto.getUserId()).orElse(null);
		Post post = new Post(author, dto.getTitle(), dto.getDescription());
		return postRepository.save(post);
	}
	
	
}
