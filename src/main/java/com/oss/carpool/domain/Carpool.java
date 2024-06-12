package com.oss.carpool.domain;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
	private String date;
	
	@OneToOne
	@JoinColumn(name = "provider_id")
	@JsonIgnore
	private User provider;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JsonIgnore
	private List<User> users = new ArrayList<User>();
	
	
	
	public Carpool(String departures, String arrivals, User provider) {
		this.departures = departures;
		this.arrivals = arrivals;
		this.provider = provider;
	}

	public Carpool() {	}

	@Override
	public String toString() {
		return "Carpool [id=" + id + ", departures=" + departures + ", arrivals=" + arrivals + ", date=" + date
				+ ", provider=" + provider + ", users=" + users + "]";
	};
	
	public void addUser(User user) {
		users.add(user);
	}
}
