package com.oss.carpool.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class BuyItemResponseDTO {
	private String title;
	private String userId;
	private int change;
}
