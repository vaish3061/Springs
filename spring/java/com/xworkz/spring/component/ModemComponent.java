package com.xworkz.spring.component;

public class ModemComponent {

	private String companyName;
	private float price;
	
	public void setCompanyName(String companyName) {
		System.out.println("invoked set company" +companyName);
		this.companyName=companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
}
