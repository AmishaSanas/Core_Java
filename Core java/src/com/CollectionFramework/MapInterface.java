package com.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	
	public static void main(String[] args) {
		
		//it contains unique keys

		Map m = new HashMap();

		m.put("1","one");
		m.put("2","two");
		m.put("3", "Three");

		System.out.println("Key value  = " + m.get("1"));
		
		System.out.println("Size of map  = " + m.size());
		System.out.println("Values  = " + m.values());
		System.out.println("Remove by key  = " + m.remove("1"));
		
		
		System.out.println("Contain key  = " + m.containsKey("1"));
		//System.out.println("Contain Value  = " + m.containsValue("Two"));	
	}
}