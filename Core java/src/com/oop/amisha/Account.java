package com.oop.amisha;

public class Account {

	private String number;
	private String accountType;
	private Double balance ;
	
	public String getNumber() { //get method for number
		return this.number ;
		//return is keyword to return value
	}
		public void setNumber(String number) { // set method for number
		this.number = number ;	
		// hold number value in this.number which refers to number attribute
		}
	
		public String getacountType() {
			return this.accountType ;
		}
			public void setaccountType(String accountType) {//void same type variable as attribute
				this.accountType = accountType;	
			}
		
			public Double getbalance() {
				return this.balance ;
			}
			
			public void setbalance(double balance) {
				this.balance = balance ;
			}
			
			public void deposit(double amount) {//set
				this.balance = this.balance + amount;
			}
			
			public void withdrawal(double amount) {

				this.balance = this.balance - amount;
			}
	        
			public void fundTransfer(double amount) {

				this.balance = this.balance - amount;
			}

			public void payBills(double amount) {

				this.balance = this.balance - amount;
			}

	}
	