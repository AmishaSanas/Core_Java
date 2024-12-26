package com.Multithreading;

public class MyRunnable implements Runnable {
	
	    public void run() {
	        System.out.println("Runnable thread is running.");
	    }


	    public static void main(String[] args) {
	    	
	        MyRunnable myRunnable = new MyRunnable();
	        
	        Thread thread = new Thread(myRunnable);
	        
	        thread.start(); // Starts the thread
	    }
	}