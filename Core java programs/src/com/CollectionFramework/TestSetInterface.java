package com.CollectionFramework;

import java.util.HashSet;
import java.util.Set;

//set contain unique value does not allow duplicate value
//set contain only one null value
//Order of set is by default sorted order
// does not declare any additional method, inherited methods from collection

public class TestSetInterface {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();

		s.add(5);
		s.add(3);
		s.add(5);
		s.add(5);
		s.add(null);
		s.add(null);

		System.out.println("set = " + s);
	}
}