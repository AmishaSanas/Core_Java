package com.oop.amisha;

public class Rectangle extends Shape{
	
	private int lenght;
	private int width;
	
   public Rectangle() {
	// TODO Auto-generated constructor stub
}
   public Rectangle( int lenght,int width) {//constructor overloading
	   this.lenght = lenght;
       this.width = width ;
   }
   
   @Override
   public double area() {
	      double area = lenght * width;
	      
	      return area;
}
}
