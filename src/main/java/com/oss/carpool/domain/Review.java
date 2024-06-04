package com.oss.carpool.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

//@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private User reviewee;
	
	@ManyToOne
	private User author;
	private String description;
	private Integer stars;
	
	
	public Review(Long id, User reviewee, User author, String description, Integer stars) {
		super();
		this.id = id;
		this.reviewee = reviewee;
		this.author = author;
		this.description = description;
		this.stars = stars;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getReviewee() {
		return reviewee;
	}
	public void setReviewee(User reviewee) {
		this.reviewee = reviewee;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStars() {
		return stars;
	}
	public void setStars(Integer stars) {
		this.stars = stars;
	}
	
	@Override
	public String toString() {
		return "Review [id=" + id + ", reviewee=" + reviewee + ", author=" + author + ", description=" + description
				+ ", stars=" + stars + "]";
	}
	
}
