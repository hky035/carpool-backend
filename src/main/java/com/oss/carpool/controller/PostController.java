package com.oss.carpool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oss.carpool.domain.Post;
import com.oss.carpool.dto.AddPostRequestDTO;
import com.oss.carpool.service.PostService;

@RestController
public class PostController {
	
	private PostService postService;

	@Autowired
	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@PostMapping("/api/post/add")
	public boolean addPost(@RequestBody AddPostRequestDTO dto) {
		
		Post newPost = postService.addNewPost(dto);
		
		if(newPost != null)
			return true;
		else
			return false;
	}
	
	
}
