package com.oss.carpool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.carpool.domain.User;
import com.oss.carpool.dto.LoginRequestDTO;
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
		return userRepository.save(user);
	}
	
	public boolean login(LoginRequestDTO dto) {
		User user = userRepository.findByUserId(dto.getUserId());
		if(user == null)
			return false;
		else {
			if(user.getUserId().equals(dto.getUserId())) {
				if(user.getPassword().equals(dto.getPassword()))
					return true;
			}
		}
		return false;
		
	}
}
