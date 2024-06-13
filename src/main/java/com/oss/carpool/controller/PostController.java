package com.oss.carpool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oss.carpool.domain.Post;
import com.oss.carpool.dto.AddPostRequestDTO;
import com.oss.carpool.dto.PostResponseDTO;
import com.oss.carpool.service.PostService;

@RestController
public class PostController {
	
	private PostService postService;

	@Autowired
	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@GetMapping("api/post")
	public List<PostResponseDTO> getAllPost(){
		return postService.getAllPost();
	}
	
	@PostMapping("/api/post/add")
	public PostResponseDTO addPost(@RequestBody AddPostRequestDTO dto) {
		return postService.addPost(dto);
	}
}
