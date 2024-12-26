package com.oop.inheritance;

public class TestShape {
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();//child class object
		
		r.setColor("black");
		r.setBorderWidth(12);
		r.setLenght(6);
		r.setWidth(3);

		System.out.println("color = " + r.getColor());
		System.out.println("borderwidth = " + r.getBorderWidth());
		System.out.println("lenght = " + r.getLenght());
		System.out.println("width = " + r.getWidth());
		System.out.println("area = " + r.area());
		System.out.println("----------------");
		
		Circle c = new Circle();
		
		c.setColor("Yello");
		c.setBorderWidth(8);
		c.setRadius(2);

		System.out.println("color = " + c.getColor());
		System.out.println("BorderWidth = " + c.getBorderWidth());
		System.out.println("radius = " + c.getRadius());
		System.out.println("area = " + c.area());
		System.out.println("----------------");
		
		Triangle t = new Triangle ();
		
		t.setColor("pink");
		t.setBorderWidth(3);
		t.setBase(2);
		t.setHeight(10);

		System.out.println("color = " + t.getColor());
		System.out.println("BorderWidth = " + t.getBorderWidth());
		System.out.println("Base = " + t.getBase());
		System.out.println("Height = " + t.getHeight());
		System.out.println("Area= "+ t.area());
			
	}

}
