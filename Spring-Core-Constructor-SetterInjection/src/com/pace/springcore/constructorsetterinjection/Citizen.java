package com.pace.springcore.constructorsetterinjection;

public class Citizen {
	String name;
	double aadharNo;
	byte age;
	State state;
	
	public Citizen(String name, double aadharNo, byte age, State state) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.age = age;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public double getAadharNo() {
		return aadharNo;
	}

	public byte getAge() {
		return age;
	}
	
	public State getState() {
		return state;
	}
	
	
}
