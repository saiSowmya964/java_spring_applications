package com.pace.springcore.annotations.componentscan;

import org.springframework.stereotype.Component;

@Component

public class Customer {
	int id;
	String name;
	String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void showCustomerDetails() {
		System.out.println("Customer Name:" + name);
		System.out.println("Customer City :" + city);
	}
	

}
