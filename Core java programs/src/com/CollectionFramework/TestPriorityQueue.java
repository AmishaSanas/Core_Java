package com.CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	
	public static void main(String[] args) {

		Queue q = new PriorityQueue();//It works as Priority insertion based / not contain null value

		q.add("KGF");
		q.add("Ram");
		q.add("Ajay");
		
		System.out.println(q);
		
		q.remove("KGF");
		System.out.println(q);
	}
}
// We add String first in this program so we cannot add other data type
// If we add int first so we cannot add String or other data type