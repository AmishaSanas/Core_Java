package com.Multithreading;

public class HelloThread extends Thread {
	
	String name;
	
	public HelloThread(String name) {
		this.name = name;
	}

       @Override
    public void run() {
    	   for (int i = 1; i <= 5; i++) {
    	   
    		   System.out.println(i + "Thread: " + name);
       
//    		  try {
//				sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
   			}
       }
    }