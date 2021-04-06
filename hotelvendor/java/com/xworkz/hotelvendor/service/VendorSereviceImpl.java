package com.xworkz.hotelvendor.service;

import com.xworkz.hotelvendor.entity.VendorEntity;
import com.xworkz.hotelvendor.repository.VendorRepo;

public class VendorSereviceImpl implements VendorService{

	private VendorRepo repository;
	
	public VendorSereviceImpl(VendorRepo repository) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.repository=repository;
	}
	
	@Override
	public boolean ValidAndSave(VendorEntity entity) {
		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not valid");
		}
		return false;
	}

}
