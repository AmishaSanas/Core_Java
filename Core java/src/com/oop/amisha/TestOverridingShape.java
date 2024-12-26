package com.oop.amisha;

public class TestOverridingShape {
	
	public static void main(String[] args) {

		Shape s = new Circle(2);
		Shape s1 = new Rectangle(5, 5);
		Shape s2 = new Triangle(6,3);

		System.out.println("area of circle = " + s.area());
		System.out.println("area of rectangle = " + s1.area());
		System.out.println("area of triangle = " + s2.area());

	}
}

