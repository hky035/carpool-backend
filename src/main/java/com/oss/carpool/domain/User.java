package com.oss.carpool.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name="user_details")
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="userid")
	private String userId;
	private String password;
	@Column(name="studentnumber")
	private Integer studentNumber;
	
	@OneToOne(mappedBy = "provider")
	@JsonIgnore
	private Carpool provideCarpool;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	private Carpool useCarpool;
	

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Post> posts;

	private Integer mileage;
	
	public User() {};
	
	public User(String userId, String password, Integer studentNumber) {
		this.userId = userId;
		this.password = password;
		this.studentNumber = studentNumber;
		mileage = 1000;
	}
	
}
