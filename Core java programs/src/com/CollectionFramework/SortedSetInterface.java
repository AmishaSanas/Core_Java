package com.CollectionFramework;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface { // Additional methods - first,last,headset,tailset,subset
	
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();

		s.add(10);
		//s.add("a");It works as Priority based, if we take first value as integer then all values should be integer.
		s.add(30);
		s.add(40);
		s.add(50);

		System.out.println("Set: " + s);

		System.out.println("get first element = " + s.first());
		System.out.println("get last element = " + s.last());

		// Returns elements less than the specified value
		SortedSet headSet = s.headSet(30);
		System.out.println("headSet less than(30): " + headSet);

		// Returns elements greater than or equal to the specified value
		SortedSet tailSet = s.tailSet(30);
		System.out.println("tailSet greater than or equal(30): " + tailSet);

		SortedSet subSet = s.subSet(20,50);
		System.out.println("subSet between(20, 50): " + subSet);
	}
}