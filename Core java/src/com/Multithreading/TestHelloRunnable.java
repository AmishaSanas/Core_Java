package com.Multithreading;

public class TestHelloRunnable {
	
	public static void main(String[] args) {
		
		//Runnable interface does not have start method so we make a thread object and hold TestHelloRunnable class

		Thread t1 = new Thread(new HelloRunnable("Ram")); 
		Thread t2 = new Thread(new HelloRunnable("Shyam"));

		t1.start();
		t2.start();

	}
	
}
