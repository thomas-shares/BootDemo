package com.mycompany.demo.entities;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID id;
	private String firstName;
	private String lastName;
	private Date created;
	private Date lastUpdated;
	
	public Customer( String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = new Date();
		this.lastUpdated = new Date();
	}
	
	public UUID getId() {
		return this.id;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		this.lastUpdated = new Date();
	}

	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		this.lastUpdated = new Date();
	}
	
	public Date getCreated() {
		return created;
	}
	
	public Date getLastUpdated() {
		return this.lastUpdated;
	}
}
