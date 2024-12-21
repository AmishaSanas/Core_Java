package com.oop.polymorphism;

public class Shape {

	public double area() {//method created for area
		return 0.0;
	}
	
	//return type
	
	public static Shape getShape(int i) {//if statement

	if (i == 1) {
			return new Circle(2);
		}
		if (i == 2) {
		return new Rectangle(5, 5);
		}
		if (i == 3) {
		return new Triangle(5, 5);
}

	return new Shape();

	}

}
