package com.Collection.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestant {

	public static void main(String[] args) {
		
		ArrayList<Contestant> list = new ArrayList<Contestant>();
		
		list.add(new Contestant("8294567891","Ram"));
		list.add(new Contestant("8562978424","Shyam"));
		list.add(new Contestant("8359782459","Ajay"));
		list.add(new Contestant("8294567891","Vijay"));
		list.add(new Contestant("8294568631","Jay"));
		list.add(new Contestant("8468932","Aman"));
		
		//get the phone no.
		list.stream().map(e -> e.phone).forEach(e-> System.out.println(e));
		
		//get valid phone no.
		
		System.out.println("---Valid No.---");
		list.stream().map(e -> e.phone).filter(e -> e.length()==10).forEach(e-> System.out.println(e));
		
		//Remove Duplicate
		System.out.println("--Remove Duplicate--");
		list.stream().map(e -> e.phone).filter(e -> e.length()==10).distinct().forEach(e-> System.out.println(e));
		
	    //Shuffle
		System.out.println("--Shuffle--");
		list.stream().map(e -> e.phone).filter(e -> e.length()==10).distinct()
		//stream convert collection to using shuffle method
		.collect(Collectors.collectingAndThen(Collectors.toList(), e ->{
			 Collections.shuffle(e);
			 return e.stream();	                       //Collection convert Stream
		})).forEach(e-> System.out.println(e));
		
		//Get 3 Winners limit
		System.out.println("--Limit--");
		list.stream().map(e -> e.phone).filter(e -> e.length()==10).distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(), e ->{
			 Collections.shuffle(e);
			 return e.stream();	
		})).limit(3).forEach(e-> System.out.println(e));	
}
}