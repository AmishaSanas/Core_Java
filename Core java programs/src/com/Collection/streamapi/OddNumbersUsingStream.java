package com.Collection.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersUsingStream {
	    public static void main(String[] args) {
	        // Sample list of numbers
	        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);//convert array to list

	        // Using Stream API to filter and collect odd numbers
	        List<Integer> oddNumbers = l.stream()
	                                          .filter(num -> num % 2 != 0) // Filter odd numbers
	                                          .collect(Collectors.toList()); // Collect the result into a list
	        
	        // Print the odd numbers
	        oddNumbers.forEach(System.out::println);
	    }
	}	
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		// Add multiple elements at once
//        Collections.addAll(list, 5, 3, 4, 9, 7);
//
//		//list.stream().filter(e ->oddNumber(e)).forEach(System.out::println);
//		list.stream().filter(e->{
//			 if(e % 2 ==0) {
//				 return false;
//			 }else {
//				 return true;
//			 }
//		}).forEach(System.out::println);		
//	}