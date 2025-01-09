package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="accountDetails")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String type;
   private float balance;
   @Column(name="AccountHolderName")
   private String name;
   private String branch;
   
   
public Account() {
	
}

public Account(int id, String type, float balance, String name, String branch) {
	super();
	this.id = id;
	this.type = type;
	this.balance = balance;
	this.name = name;
	this.branch = branch;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}

@Override
public String toString() {
	return "Account [id=" + id + ", type=" + type + ", balance=" + balance + ", name=" + name + ", branch=" + branch
			+ "]";
}

   
   
}
