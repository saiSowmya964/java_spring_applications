package com.pace.springcore.constructorinjection;

public class Employee {
	int id;
	String name;
	Address address;//dependency -HAS-A
	
	public Employee(int id, String name, Address address) {//Address is a bean - constructor injection
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}
	
	

}
