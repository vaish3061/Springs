package com.xworkz.customer.repository;

import com.xworkz.customer.entity.CustomerEntity;

public class CustomerRepoImpl implements CustomerRepo{

	public CustomerRepoImpl() {
		System.out.println("created" +this.getClass().getName());
	}
	
	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save method" +entity);
	}

}
