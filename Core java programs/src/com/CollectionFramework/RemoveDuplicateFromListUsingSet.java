package com.CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromListUsingSet {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();

		l.add(25);
		l.add("KGF");
		l.add('a');
		l.add(25.1);
		l.add(true);
		l.add("KGF");
		l.add(null);
		l.add(null);
		l.add("KGF");
		l.add("Aaman");

		System.out.println("List = " + l);

		Set s = new HashSet(l);

		System.out.println("set = " + s);		
  }
}
