package com.pace.springcore.annotations.componentscan;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Scanner scnr = new Scanner(System.in);
		Customer customer = (Customer) context.getBean("customer");//reference is like class
		Employee employee = (Employee) context.getBean("employee");
		customer.setId(1001);
		customer.setName("sowmya");
		customer.setCity("Ongole");
		customer.showCustomerDetails();
		
		employee.setId(101);
		employee.setName("sravya");
		employee.setSalary(200000.00f);
		System.out.println("Employee Details");
		employee.showEmpDetails();
	}

}
