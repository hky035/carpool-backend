package com.oss.carpool.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Carpool {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departures;
	private String arrivals;
	@OneToOne
	@Nullable
	@JoinColumn(name = "provider_id")
	@JsonIgnore
	private User provider;
	@OneToMany(mappedBy = "useCarpool", fetch = FetchType.LAZY)
	@Nullable
	private List<User> users;
	
	
	
	public Carpool(String departures, String arrivals, User provider) {
		this.departures = departures;
		this.arrivals = arrivals;
		this.provider = provider;
	}

	public Carpool() {	};
}
