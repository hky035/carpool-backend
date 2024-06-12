package com.oss.carpool.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter @Getter
@RequiredArgsConstructor
public class CarpoolResponseDTO {
	private Long id;
	private String departures;
	private String arrivals;
	private String date;
	private Long providerId;
	private int users;
}
