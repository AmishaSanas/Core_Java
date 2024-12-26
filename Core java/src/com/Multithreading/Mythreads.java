package com.Multithreading;

public class Mythreads implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Value of  i is " + 1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Mythreads t = new Mythreads();
		
		Thread t1 = new Thread(t);
		
		t1.start();
		
	}

}
