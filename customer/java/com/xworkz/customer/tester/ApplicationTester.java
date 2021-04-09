package com.xworkz.customer.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.customer.entity.CustomerEntity;
import com.xworkz.customer.service.CustomerService;

public class ApplicationTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("application-db.xml","Application.xml");
		CustomerService service1=container.getBean(CustomerService.class);
		//CustomerEntity entity1=new CustomerEntity(1,"manu","bangalore",1589631478,9);
		CustomerEntity entity2=new CustomerEntity(1,"arun","bangalore",1589631498,8);
		CustomerEntity entity3=new CustomerEntity(2,"arjun","bangalore",1589636778,6);
		CustomerEntity entity4=new CustomerEntity(3,"krishna","mangalore",689636778,6);
		//service1.ValidAndSave(entity2);
		service1.ValidAndSave(entity4);
		
	}
}
