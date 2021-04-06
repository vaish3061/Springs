package com.xworkz.customer.tester;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.repository.CustomerRepo;
import com.xworkz.customer.repository.CustomerRepoImpl;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.customer.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		
		CustomerEntity entity = new CustomerEntity("Rajappa", "Bangalore", 98765432, 9);
		CustomerEntity entity1 = new CustomerEntity("Arun", "Mangalore", 98765431, 9);
		
		CustomerRepo repository = new CustomerRepoImpl();
		repository.save(entity);
	

		CustomerService service = new CustomerServiceImpl(repository);
		service.ValidAndSave(entity);
		service.ValidAndSave(entity1);
		
	}
}
