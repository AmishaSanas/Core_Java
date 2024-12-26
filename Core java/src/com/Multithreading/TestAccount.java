package com.Multithreading;

public class TestAccount extends Thread {
	
	String name;

	public static Accountsynchronized a = new Accountsynchronized();

	public TestAccount(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				a.deposit(name, 1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
	
	//create 
	public static void main(String[] args) {

		TestAccount t1 = new TestAccount("Ram");
		TestAccount t2 = new TestAccount("Shyam");

		t1.start();
		t2.start();

	}
}