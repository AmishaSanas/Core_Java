package com.Collection.streamapi;

public class AutoBoxingUnBoxing {
	
	public static void main(String[] args) {

// AutoBoxing - The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as Ab.
		 //For example – conversion of int to Integer, long to Long, double to Double, etc. 
		
		int a = 5;

		Integer i = new Integer(a);

		System.out.println(i);
		
         // UnBoxing -it is just the reverse process of AB. 
		//Automatically converting an object of a wrapper class to its corresponding primitive type is known as UB.
		
		int b = new Integer(a);
		
		System.out.println(b);

	}

}