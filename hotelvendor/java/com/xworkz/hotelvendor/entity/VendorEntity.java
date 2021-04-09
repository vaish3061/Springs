package com.xworkz.hotelvendor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.xworkz.hotelvendor.constants.HotelType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "hotel")
public class VendorEntity {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "RATING")
	private int rating;
	@Column(name = "PHONENUMBER")
	private long phoneNumber;
	@Column(name = "TYPE")
	private HotelType hoteltype;
	

	public VendorEntity(String namae, String location, int phoneNumber, int rating, HotelType type) {
		super();
		this.name = namae;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.rating = rating;
		this.hoteltype = type;
	}

	
	
}