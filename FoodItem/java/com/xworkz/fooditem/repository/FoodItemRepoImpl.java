package com.xworkz.fooditem.repository;

import com.xworkz.fooditem.entity.FoodEntity;

public class FoodItemRepoImpl implements FoodItemRepo{

	public FoodItemRepoImpl() {
		System.out.println("created FoodItemRepoImpl");
	}
	
	@Override
	public void save(FoodEntity entity) {
		
		System.out.println("invoked save method" +entity);
		
	}

	
}
