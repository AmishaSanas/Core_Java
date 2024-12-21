package com.Collection.streamapi;

public class EmployeeSalary {

	int salary;
	String name;

	public EmployeeSalary(int salary, String name) {

		this.salary = salary;
		this.name = name;

	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
