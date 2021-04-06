package com.xworkz.customer.service;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepo repository;

	public CustomerServiceImpl(CustomerRepo repository) {
		System.out.println("created" + this.getClass().getName());
		this.repository = repository;
	}

	@Override
	public boolean ValidAndSave(CustomerEntity entity) {

		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid ");
			this.repository.save(entity);
		} else {
			System.out.println("entity is not is valid");
		}
		return false;
	}

}
