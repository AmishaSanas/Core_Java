package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTestMarksheet { //
	
	public static void main(String[] args) {
		
		ArrayList<ComparableMarksheet> list = new ArrayList<ComparableMarksheet>();
		
		list.add(new ComparableMarksheet("104", "Ram", 56, 62, 72));
		list.add(new ComparableMarksheet("102", "Baldev", 55, 91, 63));
		list.add(new ComparableMarksheet("105", "Uday", 58, 73, 55));
		list.add(new ComparableMarksheet("103", "Aaman", 66, 85, 75));
		list.add(new ComparableMarksheet("101", "Pawan", 36, 42, 33));

		//list.forEach(System.out::println);

		System.out.println("----------comparable Start-----------");

		Collections.sort(list);//sort elements by Comparable
		
	 list.forEach(System.out::println);

	} 

}