package com.oss.carpool.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class BuyItemRequestDTO {
	private Long userId;
	private Long itemId;
}
