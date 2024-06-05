package com.oss.carpool.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestDTO {
	private String userId;
	private String password;
	private Integer studentNumber;
	
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public Integer getStudentNumber() {
		return studentNumber;
	}
	
	
}
