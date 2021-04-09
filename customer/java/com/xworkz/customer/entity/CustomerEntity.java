package com.xworkz.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "PHONENO")
	private int phoneNo;
	@Column(name = "RATING")
	private int rating;

	public CustomerEntity(int id, String name, String location, int phoneNo, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.phoneNo = phoneNo;
		this.rating = rating;
	}

}