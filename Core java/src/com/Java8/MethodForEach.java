package com.Java8;

import java.util.Arrays;
import java.util.List;

public class MethodForEach {
	
	public static void main(String[] args) {
		
	List<String> names = Arrays.asList("Alice", "Charlie", "Angle");

	// Using forEach with a Lambda Expression
	names.forEach(name -> System.out.println(name));
	
 }

}