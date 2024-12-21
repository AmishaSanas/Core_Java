package com.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetTreesetLinkedHashSet {
	
	public static void main(String[] args) {
		
		HashSet <String> h = new HashSet<>();
		
		h.add("abc");
		h.add("ghi");
		h.add("def");
		h.add("jkl"); //order ?
		
		System.out.println("HashSet = " + h);//[abc, def, ghi, jkl]
		
      TreeSet <String> t = new TreeSet<>(); // sorted order
        t.add("a");
		t.add("c");
		t.add("b");
		
		System.out.println("TreeSet = " + t);//[a, b, c]
		
		LinkedHashSet l = new LinkedHashSet(); //insertion order
		 
	    l.add(0);
     	l.add(3);
		l.add(2);
     	l.add(1);
     	
     	System.out.println("LinkedHashSet = " + l);//[0, 3, 2, 1]
	}
}