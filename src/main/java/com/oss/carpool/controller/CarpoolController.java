package com.oss.carpool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oss.carpool.domain.Carpool;
import com.oss.carpool.service.CarpoolService;

@RestController
public class CarpoolController {
	private CarpoolService carpoolService;

	@Autowired
	public CarpoolController(CarpoolService carpoolService) {
		this.carpoolService = carpoolService;
	}
	
	@GetMapping("/api/carpool")
	public List<Carpool> getAllCarpool(){
		return carpoolService.getAllCarpool();	
	}
	
	@GetMapping("/api/carpool/{id}")
	public Carpool getCarpool(@PathVariable("id") Long id) {
		return carpoolService.getCarpool(id);
	}
	
}
