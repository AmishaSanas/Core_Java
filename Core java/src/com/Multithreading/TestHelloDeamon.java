package com.Multithreading;

public class TestHelloDeamon {
	
	public static void main(String[] args) {

		HelloDeamon t = new HelloDeamon("DeamonThread...");

		t.setDaemon(true);

		t.start();

		for (int i = 1; i <= 5; i++) {

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Main thread finished.");
		}

	}
	
}
