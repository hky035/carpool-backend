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
	
	public LoginResponseDTO login(LoginRequestDTO dto) {
		User user = userRepository.findByUserId(dto.getUserId());
		
		LoginResponseDTO resDto = new LoginResponseDTO();
		if(user != null) {
			if(user.getPassword().equals(dto.getPassword())) {
				resDto.setId(user.getId());
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
	
	public LoginResponseDTO register(RegisterRequestDTO dto) {
		User user = new User(dto.getUserId(), dto.getPassword(), dto.getStudentNumber());
		LoginResponseDTO res = new LoginResponseDTO();
		
		if(userRepository.findByUserId(dto.getUserId()) == null) {
			userRepository.save(user);
			
			User newUser = userRepository.findByUserId(dto.getUserId());
			res.setId(newUser.getId());
			res.setUserId(newUser.getUserId());
			res.setStudentNumber(newUser.getStudentNumber());
		}
		return res;
	}
	

}
