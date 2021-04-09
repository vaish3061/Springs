package com.xworkz.hotelvendor.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.hotelvendor.constants.HotelType;
import com.xworkz.hotelvendor.entity.VendorEntity;
import com.xworkz.hotelvendor.service.VendorService;

public class HotelVendorAppTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("application-db.xml","app.xml");
		
		VendorService service2=container.getBean(VendorService.class);
		VendorEntity entity2=new VendorEntity("Nakshatra","Ballari",98765432,9, HotelType.RETAILER);
		VendorEntity entity3=new VendorEntity("Janu","Ballari",98765433,10, HotelType.RETAILER);
		service2.ValidAndSave(entity3);
		
	}
}
