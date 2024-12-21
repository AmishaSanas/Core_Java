package com.CollectionFramework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionMethods {
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add("Ram");                                //insert new element
		c1.add("Student");
		c1.add("Ram");
		
		System.out.println("Size = " + c1.size());
		
		c1.remove("Ram");
		System.out.println("Remove Ram = " + c1);
		
       // Iterator it = c1.iterator();
		//while (it.hasNext()) {	
			//System.out.println("Iterator = " + it.next());	
		//}
		
//		c1.clear();                               // remove all elements
//	System.out.println("Remove all elements = " + c1);

	    System.out.println("Empty Collection = " + c1.isEmpty());
		
        Collection c2 = new ArrayList();
	
		c2.add("a");
		c2.add("Ram");
		c2.add("Student");
     	c2.add(5.2);
     	c2.add("a");
     	c2.add(5.2);
		
		c2.addAll(c1);                             //add a collection
		System.out.println("Add All Collection= " + c2);
		
		//System.out.println("c1 = " + c1);
		//System.out.println("c2 = " + c2);
		
		System.out.println("Contain All Collection in C2= " + c2.containsAll(c1));
				
		c2.retainAll(c1);
		System.out.println("Retain = " + c2);	
		
		c2.removeAll(c2); 
		System.out.println("Remove All = " + c2);
	}
}