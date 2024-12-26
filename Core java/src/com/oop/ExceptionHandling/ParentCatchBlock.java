package com.oop.ExceptionHandling;

public class ParentCatchBlock {
	
	public static void main(String[] args) {
		 
		String Name = "Anjali";
		
		try {
			System.out.println("Character of 6th Position =  " + Name.charAt(7));

	} catch (NullPointerException e) {
			System.out.println("Exception = " + e.getMessage());
			
		}catch (RuntimeException e) {
			System.out.println("Parent Exception = " + e.getMessage());
	
		}finally {
		    System.out.println("Using Parent Exception in this program");
    }
		System.out.println("Program Successfully Run");
  }
}
