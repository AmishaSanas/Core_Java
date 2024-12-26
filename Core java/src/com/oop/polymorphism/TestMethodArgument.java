package com.oop.polymorphism;

public class TestMethodArgument {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];

		s[0] = new Circle(2);
		s[1] = new Rectangle(2, 2);
		s[2] = new Triangle(5, 5);

		System.out.println("Total Area = " + calculateArea(s));
	}
         //method for total area
	
	public static double calculateArea(Shape[] s) {//object = parameter

		double TotalArea = 0.0;

		for (int i = 0; i < s.length; i++) {

			System.out.println("Area = " + s[i].area());

			TotalArea = TotalArea + s[i].area();
		}
		return TotalArea;	
	}
}