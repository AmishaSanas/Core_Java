package com.oop.amisha;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();// account = class,a = object,new= keyword, AccountConstructor
		
		a.setNumber("AS425624");
		a.setaccountType("saving");
		a.setbalance(100.0);
		
		System.out.println("Account no = " + a.getNumber());
		System.out.println("Account type = " + a.getacountType());
		System.out.println("Account balance = " + a.getbalance());
		
		a.deposit(100);
		System.out.println("Deposit = " + a.getbalance());
		
		a.withdrawal(50);
		System.out.println("withdrawal = " + a.getbalance());
		
		a.payBills(10);
		System.out.println("paybills = " + a.getbalance());
		
		a.fundTransfer(30);
        System.out.println("fundTransfer = " + a.getbalance());
        
	}
}
