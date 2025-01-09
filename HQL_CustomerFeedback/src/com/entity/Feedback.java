package com.entity;


import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="customerFeedback")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private int rating;
 private String comment;
 
 
 
public Feedback() {
	
}


public Feedback(int id, int rating, String comment) {
	super();
	this.id = id;
	this.rating = rating;
	this.comment = comment;
	
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}



@Override
public String toString() {
	return "Feedback [id=" + id + ", rating=" + rating + ", comment=" + comment + "]";
}

 
}
