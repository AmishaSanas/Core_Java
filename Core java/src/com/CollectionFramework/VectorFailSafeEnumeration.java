package com.CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorFailSafeEnumeration {
	
	public static void main(String[] args) {

		Vector v = new Vector(); // by default capacity of Vector is 10

		v.add("KGF");
		v.add(5.2);
		v.add(45);
		v.add('a');
		
		System.out.println("vector = " + v);
		
		System.out.println("--------Enumeration---------");//historical classes - vector,Hashtable,Stack


		// Fail Safe or Not Fail Fast
		
		Enumeration e = v.elements();

		v.add(true);

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());
		}
	}
}