package com.oop.polymorphism;

public class TestSuperConstructor extends ConstructorCalling {
	
	public static void main(String[] args) {

		TestSuperConstructor t = new TestSuperConstructor("Ram", "Indore", "8985856985");

	}

	public TestSuperConstructor() {//default

		super();//parent class constructor

	}
	
	public TestSuperConstructor (String name,String address,String mobileNo) {
		super(name, address, mobileNo);
	}

}
