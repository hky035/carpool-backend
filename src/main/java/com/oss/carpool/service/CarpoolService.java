package com.oss.carpool.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.carpool.domain.Carpool;
import com.oss.carpool.domain.User;
import com.oss.carpool.dto.AddCarpoolRequestDTO;
import com.oss.carpool.dto.CarpoolResponseDTO;
import com.oss.carpool.dto.RegisterCarpoolRequestDTO;
import com.oss.carpool.repository.CarpoolRepository;
import com.oss.carpool.repository.UserRepository;

@Service
public class CarpoolService {
	private CarpoolRepository carpoolRepository;
	private UserRepository userRepository;

	@Autowired
	public CarpoolService(CarpoolRepository carpoolRepository, UserRepository userRepository) {
		this.carpoolRepository = carpoolRepository;
		this.userRepository = userRepository;
	}
	
	public List<CarpoolResponseDTO> getAllCarpool(){
		List<Carpool> l = carpoolRepository.findAll();
		List<CarpoolResponseDTO> res = new ArrayList<CarpoolResponseDTO>();
		for(Carpool c : l) {
			CarpoolResponseDTO dto = new CarpoolResponseDTO();
			dto.setId(c.getId());
			dto.setDepartures(c.getDepartures());
			dto.setArrivals(c.getArrivals());
			dto.setDate(c.getDate());
			dto.setProviderId(c.getProvider().getId());
			dto.setUsers(c.getUsers().size());
			res.add(dto);
		}
		return res;
	}
	
	public CarpoolResponseDTO getCarpool(Long id) {
		Carpool c = carpoolRepository.findById(id).orElse(null);
		CarpoolResponseDTO res = new CarpoolResponseDTO();
		
		res.setId(c.getId());
		res.setDepartures(c.getDepartures());
		res.setArrivals(c.getArrivals());
		res.setDate(c.getDate());
		res.setProviderId(c.getProvider().getId());
		res.setUsers(c.getUsers().size());
		return res;
	}
	
	public CarpoolResponseDTO addCarpool(AddCarpoolRequestDTO dto) {
		User provider = userRepository.findById(dto.getUserId()).orElse(null);
		Carpool c = new Carpool(dto.getDepartures(), dto.getArrivals(), provider);
		Carpool newCarpool = carpoolRepository.save(c);
		CarpoolResponseDTO res = new CarpoolResponseDTO();
		
		res.setId(newCarpool.getId());
		res.setDepartures(newCarpool.getDepartures());
		res.setArrivals(newCarpool.getArrivals());
		res.setDate(newCarpool.getDate());
		res.setProviderId(newCarpool.getProvider().getId());
		res.setUsers(newCarpool.getUsers().size());
		return res;
	}
	
	public CarpoolResponseDTO registerCarpool(RegisterCarpoolRequestDTO dto) {
		Long carpoolId = dto.getCarpoolId();
		Long userId = dto.getUserId();
		
		Carpool carpool = carpoolRepository.findById(carpoolId).orElse(null);
		User user = userRepository.findById(userId).orElse(null);
		
		carpool.addUser(user);
		user.setUseCarpool(carpool);
		
		CarpoolResponseDTO res = new CarpoolResponseDTO();
		res.setId(carpool.getId());
		res.setDepartures(carpool.getDepartures());
		res.setArrivals(carpool.getArrivals());
		res.setDate(carpool.getDate());
		res.setProviderId(carpool.getProvider().getId());
		res.setUsers(carpool.getUsers().size());
		
		userRepository.save(user);
		carpoolRepository.save(carpool);
		
		return res;
	}
	
	
	
}
