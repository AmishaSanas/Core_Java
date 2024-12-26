package com.oop.ExceptionHandling;

public class Account {

	public double Balance;

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public void withdrawal(double amount) {

		if (amount > this.Balance) {

			try {
				throw new InsufficentFundException();

			} catch (InsufficentFundException e) {
				e.printStackTrace();
			}
		} else {

			this.Balance = this.Balance - amount;
			System.out.println("withdrawal = " + this.Balance);
		}
	}
	public static void main(String[] args) {

		Account a = new Account();

		a.setBalance(1000.00);

		a.withdrawal(500.00);
	}
}