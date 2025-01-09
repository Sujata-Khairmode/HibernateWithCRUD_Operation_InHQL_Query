package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookdetails")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int b_id;
	private String b_name;
	private String author;
	private String publisher;
	private int totalCopies;
	private int availableCopies;
	
	
	public Book() {
		
	}
	
	public Book(int b_id, String b_name, String author, String publisher, int totalCopies, int availableCopies) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.author = author;
		this.publisher = publisher;
		this.totalCopies = totalCopies;
		this.availableCopies = availableCopies;
	}

	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuther(String auther) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getTotalCopies() {
		return totalCopies;
	}
	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	@Override
	public String toString() {
		return "Book [b_id=" + b_id + ", b_name=" + b_name + ", author=" + author + ", publisher=" + publisher
				+ ", totalCopies=" + totalCopies + ", availableCopies=" + availableCopies + "]";
	}
	
	
	
}
