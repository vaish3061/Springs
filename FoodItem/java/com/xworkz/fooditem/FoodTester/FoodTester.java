package com.xworkz.fooditem.FoodTester;

import com.xworkz.fooditem.constants.FoodType;
import com.xworkz.fooditem.entity.FoodEntity;
import com.xworkz.fooditem.repository.FoodItemRepo;
import com.xworkz.fooditem.repository.FoodItemRepoImpl;
import com.xworkz.fooditem.service.FoodItemService;
import com.xworkz.fooditem.service.FoodItemServiceImpl;

public class FoodTester {

	public static void main(String[] args) {
		
		FoodEntity entity = new FoodEntity("Veg-Biriyani", 120, FoodType.SOUTHINDIAN, "Good" );
		
		FoodItemRepo repository = new FoodItemRepoImpl();
		FoodItemService service = new FoodItemServiceImpl(repository);
		boolean save = service.ValidateAndSave(entity);
		System.out.println(save);
		
	}
}
