package com.xworkz.fooditem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.xworkz.fooditem.constants.FoodType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "item")
public class FoodEntity {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private int price;
	@Column(name = "FOOD_TYPE")
	private FoodType foodtype;
	@Column(name="TASTE")
	private String taste;
	
	public FoodEntity() {
		System.out.println("created FoodEntity");
	}

	public FoodEntity(int id, String name, int price, FoodType foodtype, String taste) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.foodtype = foodtype;
		this.taste = taste;
	}

	
	
}
