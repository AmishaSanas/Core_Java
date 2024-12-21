package com.Input.Output;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Integer
		int a;
		System.out.println("Please Enter any Number....");
		a = sc.nextInt();
		System.out.println("Entered data is = " + a);

		 //float
		float b;
		System.out.println("Please Enter any Float Number....");
		b = sc.nextFloat();
		System.out.println("Entered data is = " + b);

		// double
		double c;
		System.out.println("Please Enter any Double Number....");
		c = sc.nextDouble();
		System.out.println("Entered data is = " + c);

	     //String
		String d;
		System.out.println("Please Enter any String Number....");
		d = sc.nextLine();
		System.out.println("Entered data is = " + d);

		// String without space
		String e;
		System.out.println("Please Enter any String Number....");
		e = sc.next();
		System.out.println("Entered data is = " + e);
		
	}
}