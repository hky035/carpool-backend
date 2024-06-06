package com.oss.carpool.dto;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class CarpoolResponseDTO {
	private Long id;
	private String departures;
	private String arrivals;
	private Long providerId;
	private List<Long> userId;
}
