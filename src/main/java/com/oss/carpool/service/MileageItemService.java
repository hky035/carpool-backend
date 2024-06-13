package com.oss.carpool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.carpool.domain.MileageItem;
import com.oss.carpool.domain.User;
import com.oss.carpool.dto.BuyItemResponseDTO;
import com.oss.carpool.repository.MileageItemRepository;
import com.oss.carpool.repository.UserRepository;

@Service
public class MileageItemService {
	private MileageItemRepository mileageItemRepository;
	private UserRepository userRepository;
	
	@Autowired
	public MileageItemService(MileageItemRepository mileageItemRepository, UserRepository userRepository) {
		this.mileageItemRepository = mileageItemRepository;
		this.userRepository = userRepository;
	}
	
	public List<MileageItem> getAllMileageItem(){
		return mileageItemRepository.findAll();
	}
	
	public BuyItemResponseDTO buyItem(Long itemId, Long userId) {
		User user = userRepository.findById(userId).orElse(null);
		MileageItem item = mileageItemRepository.findById(itemId).orElse(null);

		BuyItemResponseDTO dto = new BuyItemResponseDTO();
		dto.setUserId(user.getUserId());
		
		if(user.getMileage() >=  item.getPrice()) {
			user.setMileage(user.getMileage() - item.getPrice());
			
			dto.setChange(user.getMileage());
			dto.setTitle(item.getTitle());
			
			userRepository.save(user);
		}
		else {
			dto.setTitle(item.getTitle());
			dto.setChange(-1);
		}
		
		return dto;
	}
	
}
