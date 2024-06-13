package com.oss.carpool.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.carpool.domain.Post;
import com.oss.carpool.domain.User;
import com.oss.carpool.dto.AddPostRequestDTO;
import com.oss.carpool.dto.PostResponseDTO;
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
	
	public List<PostResponseDTO> getAllPost(){
		List<Post> l = postRepository.findAll();
		List<PostResponseDTO> res = new ArrayList<PostResponseDTO>();
		for(Post p : l) {
			PostResponseDTO dto = new PostResponseDTO();
			
			dto.setAuthor(p.getAuthor().getUserId());
			dto.setDescription(p.getDescription());
			dto.setTitle(p.getTitle());
			dto.setId(p.getId());
			
			res.add(dto);
		}
		
		return res;
	}
	
	public PostResponseDTO addPost(AddPostRequestDTO dto) {
		User author = userRepository.findById(dto.getUserId()).orElse(null);
		Post post = new Post(author, dto.getTitle(), dto.getDescription());
		Post newPost = postRepository.save(post);
		
		PostResponseDTO res = new PostResponseDTO(newPost.getId(), newPost.getTitle(), newPost.getDescription(), newPost.getAuthor().getUserId());
		return res;
	}
	

	
	
}
