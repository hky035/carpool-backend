package com.oss.carpool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oss.carpool.domain.Carpool;
import com.oss.carpool.dto.AddCarpoolRequestDTO;
import com.oss.carpool.dto.CarpoolResponseDTO;
import com.oss.carpool.dto.RegisterCarpoolRequestDTO;
import com.oss.carpool.service.CarpoolService;

@RestController
public class CarpoolController {
	private CarpoolService carpoolService;

	@Autowired
	public CarpoolController(CarpoolService carpoolService) {
		this.carpoolService = carpoolService;
	}
	
	@GetMapping("/api/carpool")
	public List<CarpoolResponseDTO> getAllCarpool(){
		return carpoolService.getAllCarpool();	
	}
	
	@GetMapping("/api/carpool/{id}")
	public CarpoolResponseDTO getCarpool(@PathVariable("id") Long id) {
		return carpoolService.getCarpool(id);
	}
	
	@PostMapping("/api/carpool/add")
	public Carpool addCarpool(@RequestBody AddCarpoolRequestDTO dto) {
		return carpoolService.addCarpool(dto);
	}
	
	@PostMapping("/api/carpool/register")
	public CarpoolResponseDTO registerCarpool(@RequestBody RegisterCarpoolRequestDTO dto) {
		return carpoolService.registerCarpool(dto);
	}
}
