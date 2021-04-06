package com.xworkz.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.ModemComponent;

public class InitTester {

	public static void main(String[] args) {
		
		String xmlFileName = "spring-init.xml";
		
		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFileName);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		String refOfString=container.getBean(String.class);
		System.out.println(refOfString);
		
		ModemComponent refOfModem = container.getBean(ModemComponent.class);
		System.out.println(refOfModem.getCompanyName());
	}
}
