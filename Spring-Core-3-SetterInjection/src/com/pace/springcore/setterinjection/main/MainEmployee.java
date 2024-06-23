package com.pace.springcore.setterinjection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pace.springcore.setterinjection.beans.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		//  TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee)context.getBean("emp");
		
		System.out.println(emp.getId() + "--" + emp.getName());
		System.out.println("Address of employee");
		System.out.println(emp.getAddress().getAppartmentName());
		System.out.println(emp.getAddress().getArea());
		System.out.println(emp.getAddress().getCity());
		System.out.println(emp.getAddress().getFlatno());

	}

}
