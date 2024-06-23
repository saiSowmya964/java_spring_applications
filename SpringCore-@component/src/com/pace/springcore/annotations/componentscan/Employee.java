package com.pace.springcore.annotations.componentscan;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void showEmpDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee Name:" + name);
		System.out.println("Employee Salary:" + salary);
	}
	
	

}
