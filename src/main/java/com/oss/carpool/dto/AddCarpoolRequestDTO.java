package com.oss.carpool.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class AddCarpoolRequestDTO {
	private Long userId;
	private String departures;
	private String arrivals;
	private String date;
	
}
