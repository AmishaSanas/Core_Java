package com.oop.polymorphism;

public class HdfcBank extends Bank {
	
	@Override
	public double interestRate() {
		return 10.10;
	}
	 @Override
	public String getName() {
		return "Hdfc Bank";
	}
	
//public double interestRate;
	
    //public String name;

	//public double getInterestRate() {
		//return interestRate;
	//}

	//public void setInterestRate(double interestRate) {
	//	this.interestRate = interestRate;
	//}

	//public String getName() {
		//return name;
	//}

	//public void setName(String name) {
		//this.name = name;
	//}

}
