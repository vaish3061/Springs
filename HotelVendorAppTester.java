package com.xworkz.hotelvendor.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.hotelvendor.constants.HotelType;
import com.xworkz.hotelvendor.entity.VendorEntity;
import com.xworkz.hotelvendor.service.VendorService;

public class HotelVendorAppTester {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("app.xml");
		
		VendorService service2=container.getBean(VendorService.class);
		VendorEntity entity2=new VendorEntity("Nakshatra","Ballari",98765432,9, HotelType.RETAILER);
		service2.ValidAndSave(entity2);
		
	}
}
