package com.oss.carpool.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {
	@Id
	@GeneratedValue
	private Long id;
	private String userId;
	private String password;
//	private List<Post> posts;
//	private List<Review> reviews;
	private Integer mileage;
	
	
	public Member(Long id, String userId, String password, /*List<Post> posts, List<Review> reviews,*/ Integer mileage) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
//		this.posts = posts;
//		this.reviews = reviews;
		this.mileage = mileage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	public List<Post> getPosts() {
//		return posts;
//	}
//	public void setPosts(List<Post> posts) {
//		this.posts = posts;
//	}
//	public List<Review> getReviews() {
//		return reviews;
//	}
//	public void setReviews(List<Review> reviews) {
//		this.reviews = reviews;
//	}
	public Integer getMileage() {
		return mileage;
	}
	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", password=" + password + ", mileage=" + mileage + "]";
	}
	
	
}
