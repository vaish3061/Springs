package com.xworkz.fooditem.FoodTester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooditem.constants.FoodType;
import com.xworkz.fooditem.entity.FoodEntity;
import com.xworkz.fooditem.service.FoodItemService;

public class FoodTesterApp {

	public static void main(String[] args) {
		
		ApplicationContext container=new ClassPathXmlApplicationContext("application-db.xml","application.xml");
		FoodItemService service=container.getBean(FoodItemService.class);
		FoodEntity entity=new FoodEntity(1,"Veg-Biriyani",60,FoodType.SOUTHINDIAN,"Good");
		service.ValidateAndSave(entity);
	}
}
