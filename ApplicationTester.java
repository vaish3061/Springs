package com.xworkz.customer.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.service.CustomerService;

public class ApplicationTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("Application.xml");
		CustomerService service1=container.getBean(CustomerService.class);
		CustomerEntity entity1=new CustomerEntity("manu","bangalore",1589631478,9);
		service1.ValidAndSave(entity1);
		
	}
}
