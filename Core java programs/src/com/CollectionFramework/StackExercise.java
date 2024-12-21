package com.CollectionFramework;

import java.util.Stack;

public class StackExercise {
	
	public static void main(String[] args) {
		
		Stack stack1  = new Stack ();
		
		for (char c = 'a'; c <= 'z'; c++) { // Push strings "a." to "z." onto the first stack
			
			stack1.push(c);
		}
		
		System.out.println("Stack = " + stack1 );
		
		Stack stack2  = new Stack ();
		
		// Transfer elements from stack1 to stack2
		while (!stack1.isEmpty()) { //remove and add
			
			//System.out.println("Stack Remove = " + s1.push(s.pop()));
			stack2 .push(stack1 .pop());   //Returns top and removes it from stack1
		}
		
		System.out.println("Reverse = " + stack2 );
	}

}
