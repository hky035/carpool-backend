package com.oss.carpool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.carpool.domain.MileageItem;
import com.oss.carpool.repository.MileageItemRepository;
import com.oss.carpool.repository.UserRepository;

@Service
public class MileageItemService {
	private MileageItemRepository mileageItemRepository;
	private UserRepository userRepository;
	
	@Autowired
	public MileageItemService(MileageItemRepository mileageItemRepository) {
		this.mileageItemRepository = mileageItemRepository;
	}
	
	public List<MileageItem> getAllMileageItems(){
		return mileageItemRepository.findAll();
	}
	
}
