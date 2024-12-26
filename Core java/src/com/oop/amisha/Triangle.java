package com.oop.amisha;

public class Triangle extends Shape {
	
	private int base;
	private int height;
	 
	public Triangle( int base, int height) {
		  this.base = base;
		 this.height = height;
	}
	@Override
		public double area(){
			 
			 double area = base * height / 2;
			 
			 return area;
	}
}
