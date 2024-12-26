package com.CollectionFramework;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueueInterface {
	
	public static void main(String[] args) {

		//It follows FIFO , insertion (offer/add),extraction(poll/remove) and inspection(peek/element)
		//it does not allow Null value
		
		Queue q = new ArrayDeque();

		q.offer("Cherry");//add an element to the queue
		q.offer(3);
		q.offer(3);
		q.add(6);
		//q.add(null); nullpointerexception
		
		System.out.println("Queue = " + q);

		//peek returns an element without removal
		System.out.println("Peek  = " + q.peek());
		
		//q.remove();
    	//System.out.println("Remove = " + q);
		
		//q.poll(); // removes an element
		System.out.println("Poll 1= " + q.poll());
		System.out.println("Poll 2= " + q.poll());
		System.out.println("Poll 3= " + q.poll());
		System.out.println("Poll 3= " + q.poll());
		
		System.out.println("Queue after poll = " + q);
	
		//while (!q.isEmpty()) {

			//System.out.println(q.poll());

		//}
		//System.out.println(q);
	}
}