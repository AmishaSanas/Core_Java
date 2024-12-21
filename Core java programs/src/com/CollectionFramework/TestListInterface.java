package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListInterface {
	
	public static void main(String[] args) {
		
		// List Contain Multiple null values and Duplicate Values
		// List Supported Multiple Data Type
		// Insertion order 
		
		List l = new ArrayList();
		
		l.add(0,25);
		l.add(1,"KGF");
		l.add(2,'a');
		l.add(3,25.1);
		l.add(4,true);
		l.add(5,"KGF");
		l.add(6,null);
		l.add(7,null);
		l.add(8,"Aaman");
		
		
	   System.out.println("All Element Of List = " + l);
	   
	   System.out.println("value of 8 index  = " + l.get(8));//return an object from given index
	   
	   System.out.println("Replace an object from 8 index = " + l.set(8, "Ram"));
	   System.out.println("New List = " + l);
	   
	   System.out.println("Remove an object from 8 index = " + l.remove(8));
	   
	   System.out.println("Sub list of the specified portion from - to index = " + l.subList(0, 4));
		
		System.out.println("Start index of KGF = " + l.indexOf("KGF"));//Searches an element from from Start and returns index
		
		System.out.println("last index of KGF = " + l.lastIndexOf("KGF")); //Searches an element from from end and returns index
		
		Iterator it = l.iterator(); 

	    while (it.hasNext()) { 
	    	
	    	System.out.println(it.next());// next - returns next element in the iterator
			
		}
		
	}

}
