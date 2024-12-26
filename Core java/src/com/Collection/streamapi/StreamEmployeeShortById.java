package com.Collection.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEmployeeShortById {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList();
		
		list.add(new Employee(1,"Ram"));
		list.add(new Employee(3,"Aman"));
		list.add(new Employee(2,"Shyam"));
		list.add(new Employee(4,"Rohit"));
		
		//list.stream().sorted(Comparator.comparingInt(Employee::getId))
		             //.forEach(e -> System.out.println(e.getId() + " = " + e.getName()));
		
		 
	}

}