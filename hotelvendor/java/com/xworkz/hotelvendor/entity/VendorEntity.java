package com.xworkz.hotelvendor.entity;

import com.xworkz.hotelvendor.constants.HotelType;

public class VendorEntity {

	private String namae;
	private String location;
	private int phoneNumber;
	private int rating;
	private HotelType type;
	
	public VendorEntity() {
		System.out.println("created" +this.getClass().getName());
	}

	public VendorEntity(String namae, String location, int phoneNumber, int rating, HotelType type) {
		super();
		this.namae = namae;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.rating = rating;
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((namae == null) ? 0 : namae.hashCode());
		result = prime * result + phoneNumber;
		result = prime * result + rating;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VendorEntity other = (VendorEntity) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (namae == null) {
			if (other.namae != null)
				return false;
		} else if (!namae.equals(other.namae))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (rating != other.rating)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VendorEntity [namae=" + namae + ", location=" + location + ", phoneNumber=" + phoneNumber + ", rating="
				+ rating + ", type=" + type + "]";
	}

	public String getNamae() {
		return namae;
	}

	public void setNamae(String namae) {
		this.namae = namae;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public HotelType getType() {
		return type;
	}

	public void setType(HotelType type) {
		this.type = type;
	}
	
}