package com.oop.polymorphism;

public class Circle extends Shape {
	

	    public int radius;//attribute
	    
	   public Circle() {
		// TODO Auto-generated constructor stub
	}
	   
	   public Circle(int radius){//constructor overloading
		 this.radius = radius ;
		}
	   //getter setter
	    public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
//method overrirde
		@Override
	    public double area() {
	        double area = 3.14 * radius * radius;
	        return area;    
	    } 
	}

