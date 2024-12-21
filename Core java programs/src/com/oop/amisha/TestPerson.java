package com.oop.amisha;

import java.util.Date;

public class TestPerson {
	public static void main(String[] args) {
		
		Person p = new Person();// object
		
		p.setName("Ram");
		
		String name = p.getName();//hold value of same class
	
		System.out.println(name);
		
		
		p.setAddress("Indore");
		
		String address = p.getAddress();
		
		System.out.println(address);
		
		
		p.setDob(new Date());// current date new date method 
		
		Date dob = p.getDob();
		
		System.out.println(dob);
		
	}

}
