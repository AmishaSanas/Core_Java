package com.oop.ExceptionHandling;

public class UnCheckedException {
	
	public static void main(String[] args) {
		
		dad();
	}

	public static void dad() {
		try {
			mom();
		} catch (RuntimeException e) {

			System.out.println("Caught by Dad,raised by son");
		}
	}
		
	public static void mom() {
		son();
	}

	public static void son() {

		throw new RuntimeException("I Made a Mistake");
	}
}
