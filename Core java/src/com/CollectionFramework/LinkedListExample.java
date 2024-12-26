package com.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {//adding and deleting elements from the middle of the collection
	
	public static void main(String[] args) {

		LinkedList fruits = new LinkedList();//

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		Iterator it = fruits.iterator();

		while (it.hasNext()) {

			System.out.println("Fruits in the list: " + it.next());
		}

		System.out.println("First fruit: " + fruits.get(0));
		
		fruits.addFirst("Orange");
		System.out.println("First Element : " + fruits.getFirst());
		
		fruits.addLast("Strawberry");
		System.out.println("Last Element : " + fruits.getLast());

		fruits.remove("Banana");
		System.out.println("After removing Banana: " + fruits);
	
		fruits.add(2, "Pineapple");
		System.out.println(" adding Fruit at index 2: " + fruits);	
		
		System.out.println("New list = " + fruits);
	}
}