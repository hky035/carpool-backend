package com.oss.carpool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oss.carpool.domain.MileageItem;
import com.oss.carpool.dto.BuyItemRequestDTO;
import com.oss.carpool.dto.BuyItemResponseDTO;
import com.oss.carpool.service.MileageItemService;

@RestController
public class MileageItemController {

	
	private MileageItemService mileageItemService;

	@Autowired
	public MileageItemController(MileageItemService mileageItemService) {
		this.mileageItemService = mileageItemService;
	}
	
	@GetMapping("/api/mileage-items")
	public List<MileageItem> getAllMileageItem(){
		return mileageItemService.getAllMileageItem();
	}
	
	@PostMapping("/api/mileage-item/buy")
	public BuyItemResponseDTO buyItem(@RequestBody BuyItemRequestDTO dto) {
		return mileageItemService.buyItem(dto);
	}
	
	
	
}
