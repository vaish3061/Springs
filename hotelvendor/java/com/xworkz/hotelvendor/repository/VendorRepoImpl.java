package com.xworkz.hotelvendor.repository;

import com.xworkz.hotelvendor.entity.VendorEntity;

public class VendorRepoImpl implements VendorRepo{

	public VendorRepoImpl() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@Override
	public void save(VendorEntity entity) {
		System.out.println("invoked save" +entity);
		
	}

}
