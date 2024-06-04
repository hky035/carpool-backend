package com.oss.carpool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;

@RestController
public class LoginController {
	@GetMapping("login")
	public String login(Model model) {
		return "Login successed";
	}
	
	@GetMapping("api/test")
	public String test(Model model) {
		return "test completed";
	}
}
