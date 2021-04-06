package com.xworkz.spring.component;

public class CameraComponent {

	public CameraComponent() {
		System.out.println("photography");
	}
	
	public void toCapture(String what) {
		System.out.println("invoked capture");
		System.out.println("arg1" +what);
	}
}
