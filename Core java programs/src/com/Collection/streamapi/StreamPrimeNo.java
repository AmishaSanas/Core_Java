package com.Collection.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamPrimeNo {
	
	public static boolean isPrime(int x) {
		
		int count = 0;
		
		if (x == 1) {//3 == 1
			
			return false;	
		}
		
		for (int i = 2; i < x; i++) {// X=3

			if (x % i == 0) {//3%2 !=0

				count++;
			}
		}
		return count == 0;
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		list.stream().filter(e -> isPrime(e)).forEach(e -> System.out.println(e));
			
		}
}