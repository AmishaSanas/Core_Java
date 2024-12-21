package com.oop.polymorphism;

public class Triangle extends Shape{
	
	    private int base;
	    private int height;
	    
	    public Triangle() {
			// TODO Auto-generated constructor stub
		}
	    
	   public Triangle(int base,int height) {//constructor overloading
	        this.base = base;
	        this.height = height;
	    }
	    public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

		@Override
	    public double area() {
	    double area= base*height/2;
	    return area;
	    }  
	        
	    }
	   
