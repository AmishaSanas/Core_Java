package com.oop.polymorphism;

public class TestHomeLoan {
	
	public static void main(String[] args) {
		
		Bank[] banks = new Bank[3];//parent class array
		
		banks[0] = new AxisBank();//child class array
		banks[1] = new HdfcBank();
		banks[2] = new IciciBank();
		loanEnquiry(banks);
	}

	 public static void loanEnquiry(Bank[] banks) {
		for (Bank b : banks) {
			String name = b.getName();
			double rate = b.interestRate();
			System.out.println(name + " = " + rate);
			
		}
		
	}
}
		
//		b[0].setInterestRate(11.0);
//		b[0].setName("AxisBank");
//		
//		System.out.println("Bank Interest = " + b[0].getInterestRate());
//		System.out.println("Bank Name = " + b[0].getName());
//		System.out.println("=============");
//		
//		b[1].setInterestRate(10.0);
//		b[1].setName("HdfcBank");
//		
//		System.out.println("Bank Interest = " + b[1].getInterestRate());
//		System.out.println("Bank Name = " + b[1].getName());
//		System.out.println("=============");
//		
//		b[2].setInterestRate(09.75);
//		b[2].setName("IciciBank");
//		
//		System.out.println("Bank Interest = " + b[2].getInterestRate());
//		System.out.println("Bank Name = " + b[2].getName());
//		System.out.println("=============");
 

