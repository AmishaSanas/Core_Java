package com.oop.polymorphism;

public class ConstructorCalling {
	
	public String name;
	public String address;
	public String mobileNo;
	
	public ConstructorCalling() {
		System.out.println("This is default constructor");
	}

	public ConstructorCalling (String name,String address) {
		this();
		this.name = name;
		this.address = address;
		System.out.println("Name = " + this.name);
		System.out.println("Address = " + this.address);
	}
	public ConstructorCalling (String name,String address,String mobileNo) {
		this(name, address);
		this.mobileNo = mobileNo;
		System.out.println("MobileNo = " + this.mobileNo);
	}
}
