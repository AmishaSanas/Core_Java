package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();// Slower for insertions or deletions, especially in the middle (due to shifting elements).


		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(null);
		System.out.println("First List = " + l);
		System.out.println("get index = " + l.get(3));
		
		l.remove(2);
		System.out.println(" List = " + l);
		
		System.out.println("First List Size = " + l.size());
		
		//Check elements is there or not
		System.out.println(l.contains(20));

//		ArrayList Al = new ArrayList();
//
//		Al.add(30);
//		Al.add(40);
//		Al.addAll(l);
//
//		System.out.println("Second List = " + Al);
//		// Al.clear();

		Iterator it = l.iterator();

		while (it.hasNext()) {
			
			//it.remove();

			System.out.println(it.next());
		}
	}
}