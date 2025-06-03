package com.cts.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("501")
	private int id;
	
	@Value("Ashutosh")
	private String name;
	
	@Value("8000")
	private double salary;
	
	//@Autowired  //Field Injection or Property Injection
	private Address address;

	public Employee() {
		
	}

	//@Autowired //Constructor Injection
	public Employee(int id, String name, double salary,Address address) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}


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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired //Setter Injection
	public void setAddress(@Qualifier("address2") Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

}
