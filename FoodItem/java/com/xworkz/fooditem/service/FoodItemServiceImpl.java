package com.xworkz.fooditem.service;

import com.xworkz.fooditem.entity.FoodEntity;
import com.xworkz.fooditem.repository.FoodItemRepo;

public class FoodItemServiceImpl implements FoodItemService{

	private FoodItemRepo repository;
	
	public FoodItemServiceImpl(FoodItemRepo repository ) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.repository = repository;
	}
	
	@Override
	public boolean ValidateAndSave(FoodEntity entity) {
		System.out.println("invoked validateAndSave " + entity);
		if (entity != null) {
			this.repository.save(entity);
			System.out.println("entity is valid");
			
		} else {
			System.out.println("entity is not valid");
		}
		return false;
	}

}
