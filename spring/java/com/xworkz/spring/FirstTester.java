package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.InsuranceComponent;
import com.xworkz.spring.component.JailComponent;

public class FirstTester {

	public static void main(String[] args) {
		String xmlFileName = "second-step-in-spring.xml";
		String xmlFileName1 = "first-step-in-spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFileName,xmlFileName1);
		InsuranceComponent insur = container.getBean(InsuranceComponent.class);
		insur.policyName();
		System.out.println(insur.policyName());
		JailComponent jail = container.getBean("jailComponent",JailComponent.class);
		System.out.println(container.getBeanDefinitionCount());
	}
}
