package com.oss.carpool.service;

import java.util.List;

import com.oss.carpool.dto.BuyItemRequestDTO;
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
	
	public BuyItemResponseDTO buyItem(BuyItemRequestDTO dto) {
		User user = userRepository.findById(dto.getUserId()).orElse(null);
		MileageItem item = mileageItemRepository.findById(dto.getItemId()).orElse(null);

		BuyItemResponseDTO res = new BuyItemResponseDTO();
		res.setUserId(user.getUserId());
		
		if(user.getMileage() >=  item.getPrice()) {
			user.setMileage(user.getMileage() - item.getPrice());
			
			res.setChange(user.getMileage());
			res.setTitle(item.getTitle());
			
			userRepository.save(user);
		}
		else {
			res.setTitle(item.getTitle());
			res.setChange(-1);
		}
		
		return res;
	}
	
}
