package com.oss.carpool.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class RegisterCarpoolRequestDTO {
	private Long userId;
	private Long carpoolId;
}
