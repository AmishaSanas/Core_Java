package com.oop.ExceptionHandling;

public class TryCatch {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		try { 
			int c = a/b;
			System.out.println(c);
			
		} catch (Exception e) {//parent class of RuntimeException
			System.out.println("Exception is = " + e.getMessage());
		}
		
		System.out.println("End");
	}

}