package com.CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeExample {
		
	    public static void main(String[] args) {
	    	
	        ArrayDeque<String> deque = new ArrayDeque<>();

	        // Adding elements to the deque
	        deque.add("Samsung");
	        deque.add("Oneplus");
	        deque.add("Apple");
	        deque.add("Vivo");
	        
	        System.out.println(deque);

	        // Access elements
	        System.out.println("First Element: " + deque.getFirst()); // Output: samsung
	        System.out.println("Last Element: " + deque.getLast());   // Output: vivo

	        // Removing elements
	        deque.removeFirst(); // Removes "First"
            System.out.println("Deque after removals: " + deque);//[Oneplus, Apple, Vivo]
            
            System.out.println("peek method get first e: " + deque.peek());
    		System.out.println(deque);

    		System.out.println("poll method remove first e: " + deque.poll());
    		System.out.println(deque);

            
            
	    }
	}