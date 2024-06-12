package com.oss.carpool.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter @Setter
public class LoginRequestDTO {
	private String userId;
	private String password;	
}
