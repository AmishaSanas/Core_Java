package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCollectionsClass {

		    public static void main(String[] args) {
		    	ArrayList list = new ArrayList();
		    	
		    	list.add(5);
			    list.add(1);
				list.add(4);
			    list.add(2);
			    list.add(3);
		
		        // Sorting
		        Collections.sort(list);
		        System.out.println("Sorted List: " + list);
		        
		        // Search for an existing element
		        System.out.println("Index of 2: " + Collections.binarySearch(list, 2));
		      
		        // Shuffle = random numbers
		        Collections.shuffle(list);
		        System.out.println("Shuffled List: " + list);

		        // Reverse
		        Collections.reverse(list);
		        System.out.println("Reversed List: " + list);
		   
		        // Thread-safe List
		        List<Integer> syncList = Collections.synchronizedList(list);
		        System.out.println("Thread-safe List: " + syncList);
		        
		        // Create Empty Collection
		        System.out.println("Empty List =  " + Collections.emptyList());       
		    }
	}