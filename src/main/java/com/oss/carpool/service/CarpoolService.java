package com.oss.carpool.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.carpool.domain.Carpool;
import com.oss.carpool.dto.CarpoolResponseDTO;
import com.oss.carpool.repository.CarpoolRepository;

@Service
public class CarpoolService {
	private CarpoolRepository carpoolRepository;

	@Autowired
	public CarpoolService(CarpoolRepository carpoolRepository) {
		this.carpoolRepository = carpoolRepository;
	}
	
	public List<Carpool> getAllCarpool(){
		System.out.println("excuted!!!!!");
//		List<Carpool> result = carpoolRepository.findAll();
//		System.out.println(result.size());
//		List<CarpoolResponseDTO> dto = new ArrayList<CarpoolResponseDTO>();
//		for(Carpool c : result) {
//			CarpoolResponseDTO newDto = new CarpoolResponseDTO();
//			newDto.setId(c.getId());
//			newDto.setDepartures(c.getDepartures());
//			newDto.setArrivals(c.getArrivals());
//			newDto.setProviderId(c.getProvider().getId());
//		}
		return carpoolRepository.findAll();
	}
	
	public Carpool getCarpool(Long id) {
		Carpool c = carpoolRepository.findById(id).orElse(null);
		return c;
	}
	
	
	
}
