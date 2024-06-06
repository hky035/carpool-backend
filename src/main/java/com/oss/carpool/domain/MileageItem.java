package com.oss.carpool.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MileageItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private Integer price;
	
	public MileageItem() {};
	
	public MileageItem(String title, String description, Integer price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}
}
