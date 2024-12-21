package com.Collection.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHighestSalary {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		
		list.add(10000);
		list.add(12000);
		list.add(9000);
		list.add(11000);
		
		System.out.println(list);
		
		System.out.println("First Highest Salary");
		list.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(e->System.out.println(e));
		
		System.out.println("Second Highest Salary");
		
		list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(e->System.out.println(e));
		
	}

}