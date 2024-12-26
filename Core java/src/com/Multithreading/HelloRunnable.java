package com.Multithreading;

public class HelloRunnable implements Runnable {
	
	String name;

	public HelloRunnable(String n) {

		this.name = n;

	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println(i + "Thread: " + name);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}

		}

	}

}