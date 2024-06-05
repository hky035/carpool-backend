package com.oss.carpool.dto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginRequestDTO {
	private String userId;
	private String password;
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	
	
}
