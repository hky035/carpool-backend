package com.oss.carpool.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.carpool.domain.Post;
import com.oss.carpool.domain.User;
import com.oss.carpool.dto.AddPostRequestDTO;
import com.oss.carpool.dto.AllPostResponseDTO;
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
	
	public List<AllPostResponseDTO> getAllPost(){
		System.out.println("exucted!!!!");
		List<Post> l = postRepository.findAll();
		List<AllPostResponseDTO> res = new ArrayList<AllPostResponseDTO>();
		for(Post p : l) {
			System.out.println(p.getTitle());
			AllPostResponseDTO dto = new AllPostResponseDTO();
			dto.setAuthor(p.getAuthor().getUserId());
			dto.setDescription(p.getDescription());
			dto.setTitle(p.getTitle());
			dto.setId(p.getId());
			res.add(dto);
		}
		
		for(AllPostResponseDTO d : res) {
			System.out.println(d.getTitle() + "/ " + d.getAuthor() + "/" + d.getId());
		}
		return res;
	}
	
	
}
