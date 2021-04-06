package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.CameraComponent;

public class SpringTester {

	public static void main(String[] args) {
		
		String xmlFileName ="first-step-in-spring.xml";
		
		ApplicationContext spring = new ClassPathXmlApplicationContext(xmlFileName);
		
		CameraComponent refOfCameraComponent = spring.getBean(CameraComponent.class);
		refOfCameraComponent.toCapture("capture memories");
	}
}
