package com.oss.carpool.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

//@Entity
public class Post {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private User author;
	private String title;
	private String description;
	private LocalDate date;
	
	public Post(Long id, User author, String title, String description, LocalDate date) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.description = description;
		this.date = date;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", author=" + author + ", title=" + title + ", description=" + description + ", date="
				+ date + "]";
	}
	
	
}
