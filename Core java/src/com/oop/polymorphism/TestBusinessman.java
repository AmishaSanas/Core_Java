package com.oop.polymorphism;

public class TestBusinessman {//
	
	public static void main(String[] args) {
		
//		Richman r = new Businessman();//dynamic Polymorphism
//		r.donation();
//		r.earnMoney();
//		r.party();
//		
//		SocialWorker s = new Businessman (); // interface not created objects
//		s.helpToOthers();
//		
		Businessman b = new Businessman();//Static
		b.donation();
		b.earnMoney();
		b.helpToOthers();
		b.party();
		
		b.setName("Sonia");
		System.out.println("Name = " + b.getName());
		
		b.setAddress("Tilak Nagar");
		System.out.println("Address = " + b.getAddress());
	}
}
