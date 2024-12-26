package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterface {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(2);
		c.add(5.9);
		c.add("Sun");
		c.add(true);
		c.add('a');
		
		System.out.println("Collection" + c);
		
		System.out.println("------forEach-Loop-------");
		
		for (Object o : c) {
			System.out.println(o);	
	  }
	}
}