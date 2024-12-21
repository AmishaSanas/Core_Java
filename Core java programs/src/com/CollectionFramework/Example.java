package com.CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Example {

	    public static void main(String[] args) {
	        // List Example (insertion order)
	        List<String> list = new ArrayList<>();
	        list.add("A");
	        list.add("c");
	        list.add(null);
	        list.add(null);//multiple null value allowed
	        list.add("A");
	        list.add("A"); // multipleDuplicates allowed
	        System.out.println("List: " + list); // [A, c, null, null, A, A]

	        // Set Example (sorted order)
	        Set<String> set = new HashSet<>();
	        set.add("a");
	        set.add("c");
	        set.add("b"); 
	        set.add(null);//one null value allowed
	        set.add("a");// Duplicates ignored
	        System.out.println("Set: " + set); // [null, a, b, c]

	        // Queue Example multiple duplicate allowed & insertion order
	        Queue<String> queue = new LinkedList<>();
	        queue.offer("A");
	        queue.offer("B");
	        queue.offer("A");
	        queue.offer("C");
	        queue.offer(null);
	        queue.offer(null);
	        
	        System.out.println("Queue: " + queue); // [A, B, A, C, null, null]
	        System.out.println("Poll(remove): " + queue.poll()); // A (FIFO)
	        System.out.println("Peek: " + queue.peek());//B
	        System.out.println("Queue after poll: " + queue); // [B, A, C, null, null]
	    }
	}