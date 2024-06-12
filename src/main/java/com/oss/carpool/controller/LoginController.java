package com.oss.carpool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oss.carpool.domain.User;
import com.oss.carpool.dto.LoginRequestDTO;
import com.oss.carpool.dto.LoginResponseDTO;
import com.oss.carpool.dto.RegisterRequestDTO;
import com.oss.carpool.service.UserService;

import ch.qos.logback.core.model.Model;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController {
	
	private UserService userService;
	
	@Autowired
	public LoginController(UserService userService) {
		this.userService = userService;
	}
	
	
	@PostMapping("api/login")
	public LoginResponseDTO login(@RequestBody LoginRequestDTO dto) {
		return userService.login(dto);
	}
	
	@PostMapping("api/register")
	public LoginResponseDTO register(@RequestBody RegisterRequestDTO dto) {
		return userService.register(dto);
	}
}
