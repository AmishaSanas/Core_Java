package com.Multithreading;

public class HelloDeamon extends Thread{
	
	String name;

	public HelloDeamon(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		 // Creating a daemon thread
		while (true) {
			//System.out.println("Daemon thread is running...");

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);

		}	
	}
	
}
