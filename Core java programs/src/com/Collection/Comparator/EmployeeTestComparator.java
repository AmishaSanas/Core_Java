package com.Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTestComparator {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee("Riya", 001, 15000));
		emp.add(new Employee("Ali", 003, 10000));
		emp.add(new Employee("Pawan", 002, 12000));
		
		
        System.out.println("Compare by name");
        
        SortByName n = new SortByName();
		Collections.sort(emp, n);
		emp.forEach(System.out::println);
		
		System.out.println("Compare by id");
		
		SortById i = new SortById();
		Collections.sort(emp, i);
		emp.forEach(System.out::println);
		
		System.out.println("Compare by Salary");
		
		SortBySalary s = new SortBySalary();
		Collections.sort(emp, s);
		emp.forEach(System.out::println);
	}
}