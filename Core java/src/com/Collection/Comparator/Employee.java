package com.Collection.Comparator;

public class Employee {

	public String name;
	public int id;
	public int salary;

	public Employee() {//constructor not have return type name same as class name

	}

	public Employee(String name, int id, int salary) { 
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}