package com.xworkz.spring.component;

public class InsuranceComponent {

	public InsuranceComponent() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	public String policyName() {
		return "Jeevan Ananad";
	}
}
