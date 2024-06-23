package com.pace.springcore.constructorsetterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCitizen {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Citizen citizen = (Citizen)context.getBean("citizen");
		
		System.out.println("Citizen Details");
		System.out.println("Name: " + citizen.getName());
        System.out.println("Aadhar No: " + citizen.getAadharNo());
        System.out.println("Age: " + citizen.getAge());
        System.out.println("State: " + citizen.getState());
		System.out.println(citizen.getName() + "--" + citizen.getAge() + "--" + citizen.getAadharNo());
		
		System.out.println("State Details Citizen");
		System.out.println(citizen.getState().getCapital());
		System.out.println(citizen.getState().getName());
		System.out.println(citizen.getState().getPopulation());
	}
}
