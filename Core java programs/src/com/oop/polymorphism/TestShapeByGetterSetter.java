package com.oop.polymorphism;

public class TestShapeByGetterSetter {
               public static void main(String[] args) {
				
            	   Shape[] s = new Shape[3];

           		s[0] = new Circle();
           		s[1] = new Rectangle();
           		s[2] = new Triangle();
           		
                //type cast parent class doesn't inheritate child class properties
                Circle c = (Circle)s[0];
                Rectangle r = (Rectangle) s[1];
                Triangle t = (Triangle) s [2];
                
                //using getter setter method
        		c.setRadius(2);
        		System.out.println("Radius = " + c.getRadius());
        		System.out.println("Area of circle = " + s[0].area());

        		r.setLenght(5);
        		r.setWidth(5);
        		System.out.println("Lenght = " + r.getLenght() + " " + "Width = " + r.getWidth());
        		System.out.println("area of rectangle = " + s[1].area());
        		
        		t.setBase(8);
        		t.setHeight(11);
        		System.out.println("Base= "+ t.getBase() + " " + "Height = " + t.getHeight());
        		System.out.println("area of triangle = " + s[2].area());    
		}
}
