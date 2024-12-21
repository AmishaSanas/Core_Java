package com.oop.ExceptionHandling;

public class Finally {
	
	public static void main(String[] args) {

		int no = 3;

		try {

			int i = no / 0;

			System.out.println(i);

		} catch (ArithmeticException e) {

			System.out.println("exception = " + e.getMessage());

		} finally {
			System.out.println("Finally block");
		}

		System.out.println("Programe is end");

	}

}