package com.Collection.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	
	public static void main(String[] args) {

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thur" }; //String array

		//Stream<String> stream = Arrays.stream(days);//Stream object = convert array to stream

		//stream.distinct().forEach(System.out::println);
		
		Arrays.stream(days).distinct().forEach(System.out::println);

		
	}

}