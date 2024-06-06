package com.oss.carpool.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class AllPostResponseDTO {
	private Long id;
	private String title;
	private String description;
	private String author;
}
