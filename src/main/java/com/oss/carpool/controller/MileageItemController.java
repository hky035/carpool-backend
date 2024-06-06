package com.oss.carpool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oss.carpool.domain.MileageItem;
import com.oss.carpool.service.MileageItemService;

@RestController
public class MileageItemController {

	
	private MileageItemService mileageItemService;

	@Autowired
	public MileageItemController(MileageItemService mileageItemService) {
		this.mileageItemService = mileageItemService;
	}
	
	@GetMapping("/api/mileage-items")
	public List<MileageItem> getMileageItems(){
//		List<MileageItem> l = mileageItemService.getAllMileageItems();
//		for(MileageItem i : l) {
//			System.out.println(i.get);
//		}
//		
		return mileageItemService.getAllMileageItems();
	}
	
	
	
}
