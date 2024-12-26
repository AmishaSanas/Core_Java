package com.oop.polymorphism;

public class PolyShape {
	
	public static void main(String[] args) {
	
		        // Create an array of Shape objects
		        Shape[] shapes = new Shape[3];
		        
		        //  different shapes using parameterized
		        shapes[0] = new Circle(5);       
		        shapes[1] = new Rectangle(4, 4); 
		        shapes[2] = new Triangle(6, 8);
		        
		        System.out.println("area of circle = " + shapes[0].area());
				System.out.println("area of rectangle = " + shapes[1].area());
				System.out.println("area of triangle = " + shapes[2].area());
				System.out.println("---------------");

		        // Loop through the array and call area() 
		        
		        for (Shape s : shapes) {
		        	System.out.println("Area = " + s.area());
					
				}
	}
}
       
         
