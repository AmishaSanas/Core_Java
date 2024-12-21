package com.oop.polymorphism;

public class AxisBank extends Bank {
	
	@Override
	public double interestRate() {
		return 11.25;
	}
	
	@Override
	public String getName() {
		return "Axis Bank";
	}

//public double interestRate;
	
    //public String name;

	//public double getInterestRate() {
		//return interestRate;
	//}

	//public void setInterestRate(double interestRate) {
		//this.interestRate = interestRate;
	//}

	//public String getName() {
		//return name;
	//}

	//public void setName(String name) {
		//this.name = name;
	//}

}
