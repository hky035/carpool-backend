package com.oss.carpool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.carpool.domain.User;
import com.oss.carpool.dto.LoginRequestDTO;
import com.oss.carpool.dto.LoginResponseDTO;
import com.oss.carpool.dto.RegisterRequestDTO;
import com.oss.carpool.repository.UserRepository;

@Service
public class UserService {
	UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User register(RegisterRequestDTO dto) {
		User user = new User(dto.getUserId(), dto.getPassword(), dto.getStudentNumber());
		if(userRepository.findByUserId(dto.getUserId()) == null) {
			return userRepository.save(user);
		}
		else {
			System.out.println("중복");
			return null;
		}
	}
	
	public LoginResponseDTO login(LoginRequestDTO dto) {
		System.out.println(dto.getPassword());
		User user = userRepository.findByUserId(dto.getUserId());
		LoginResponseDTO resDto = new LoginResponseDTO();
		if(user != null) {
			System.out.println(user.getPassword());
			if(user.getPassword().equals(dto.getPassword())) {
				resDto.setUserId(user.getUserId());
				resDto.setStudentNumber(user.getStudentNumber());
				return resDto;
			}
			else {
				return null;
			}
		}
		else
			return null;
	}
}
