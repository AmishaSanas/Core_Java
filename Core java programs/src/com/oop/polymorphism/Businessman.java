package com.oop.polymorphism;

public class Businessman extends Person implements Richman,SocialWorker {//4th childclass

	@Override
	public void helpToOthers() {
		System.out.println("Help to others");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("Earn Money");

		
	}

	@Override
	public void donation() {
		System.out.println("Give Donations");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
		
	}
//unimplemented methods
	
}
