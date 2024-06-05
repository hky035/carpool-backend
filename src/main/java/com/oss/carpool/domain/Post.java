package com.oss.carpool.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Post {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private User author;
	private String title;
	private String description;
}
