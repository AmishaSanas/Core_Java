package com.oop.ExceptionHandling;

import java.util.NoSuchElementException;

public class MultipleCatchBlock {
	
	public static void main(String[] args) {
	
	String name = "Vijay";
	
	try { System.out.println(name.length());
	
	      System.out.println(name.charAt(6));
	      
	}catch (NullPointerException e) {
	 		 System.out.println("Exception 1 = " + e.getMessage());	
	 		 
	} catch (IndexOutOfBoundsException e) {
	      System.out.println("Exception 2 = " + e.getMessage());
	      
	}catch (NoSuchElementException e) {
		System.out.println("Exception 3 = " + e.getMessage());
		
	}finally {
		  System.out.println("Complete");
	}
 }
}