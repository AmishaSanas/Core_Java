package com.Multithreading;

public class TestHelloThread {
	
	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread("Core");
		HelloThread t2 = new HelloThread("Advance");
		
		t1.setPriority(10);
		
		t1.start();
		t2.start();
		

	}

}
