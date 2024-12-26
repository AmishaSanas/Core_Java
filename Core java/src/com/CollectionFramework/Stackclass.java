package com.CollectionFramework;

import java.util.Stack;

public class Stackclass {//LIFO
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("1"); // add
		s.push("2");
		s.push("3");
		
		System.out.println("Stack = " + s);
		// Returns top and does not remove it
		System.out.println("peek = " + s.peek());
		
		//  Returns top and removes it from stack
		System.out.println("pop = " + s.pop());
		System.out.println("pop = " + s.pop());
		System.out.println("pop = " + s.pop());
		
	
	}
}
