package com.Collection.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeShortByName {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList();

		list.add(new Employee(1, "Ram"));
		list.add(new Employee(3, "Aman"));
		list.add(new Employee(2, "Shyam"));
		list.add(new Employee(4, "Rohit"));

		list.stream().sorted(Comparator.comparing(Employee::getName)) //class :: comparison attribute
				.forEach(e -> System.out.println(e.getName() + " " + e.getId()));
		
		 System.out.println("_____________");

//		 list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList())
//		 .forEach(e -> System.out.println(e.getId() + " " + e.getName()));
//		 
		 System.out.println("_____________");
		
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach( e-> System.out.println(e.getId() + " " + e.getName()));
		
		
	}
}