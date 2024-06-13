package com.oss.carpool.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class PostResponseDTO {
	private Long id;
	private String title;
	private String description;
	private String author;
}
