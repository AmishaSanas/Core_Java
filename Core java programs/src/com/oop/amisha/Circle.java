package com.oop.amisha;

public class Circle extends Shape {
	
	private int radius; //Attribute
	
	 public Circle() {
		// TODO Auto-generated constructor stub
	}
	 
	 public Circle(int radius) {//Parameterized constructor work as a setter method
		 this.radius = radius;
	 }

	public int getRadius() { // no need 
		return radius;
	}
	 
	 @Override
	public double area() { //area is used in every child class so we taken it in shape class due to its special behavior
		 
		 double area = 3.14 * radius * radius ;
				 
		return area;
	}
	
}
