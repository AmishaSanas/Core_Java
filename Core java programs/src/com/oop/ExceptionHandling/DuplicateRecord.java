package com.oop.ExceptionHandling;

public class DuplicateRecord extends Exception{
	
	public DuplicateRecord() { //constructor
		super("Duplicate Record Found");//parent constructor
	}
	
	
	//test
public static void main(String[] args) {
	
	String oldUserId = "ABC123";
	String newUserId = "ABC123";
	
	if (newUserId == oldUserId) {
		
	try {
		throw new DuplicateRecord();
	} catch (DuplicateRecord e) {
		e.printStackTrace();
	}
	}
	else { 
		System.out.println("New Record Added");
	}
	}
}
