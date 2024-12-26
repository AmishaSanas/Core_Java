package com.Multithreading;

public class Accountsynchronized {
	
	private int balance;

	public int getBalance() throws Exception {
		
		Thread.sleep(1000);
		return balance;
	}

	public void setBalance(int balance) throws Exception {
		
		Thread.sleep(1000);
		this.balance = balance;
	}
	
	
	public void deposit(String name, int amt) throws Exception {
		
		synchronized (this) {
		
		int total = balance + amt;
		
		setBalance(total);
	}
		
	System.out.println(name + " " + balance);

}
		
	}
	
//	public synchronized void deposit(String name, int amt) {
//
//		int total = balance + amt;
//
//		setBalance(total);
//
//		System.out.println(name + " " + balance);
//
//	}