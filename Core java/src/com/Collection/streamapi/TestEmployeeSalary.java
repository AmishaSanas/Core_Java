package com.Collection.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestEmployeeSalary {
	
	public static void main(String[] args) {
		
		
		List<EmployeeSalary> list = new ArrayList<EmployeeSalary>();//object

		list.add(new EmployeeSalary(20000, "Anshul"));
		list.add(new EmployeeSalary(25000, "Rakesh"));
		list.add(new EmployeeSalary(1000, "Sunil"));
		list.add(new EmployeeSalary(522, "Naman"));
		list.add(new EmployeeSalary(6000, "Sunny"));
		
		list.stream().filter(e -> (e.getSalary() >= 20000))
		.forEach(e -> System.out.println(e.getSalary() + "=" + e.getName()));
		
	}

}
