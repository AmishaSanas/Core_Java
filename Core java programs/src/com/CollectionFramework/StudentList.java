package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
	
	public static void main(String[] args) {

		ArrayList marksheets = new ArrayList();
		
		marksheets.add(new Marksheet("a1","Sakshi",64));
		marksheets.add(new Marksheet("a3","Prachi",72));
		marksheets.add(new Marksheet("a5","Ram",82));
		marksheets.add(new Marksheet("a2","Siya",85));
		marksheets.add(new Marksheet("a4","Som",52));
		
		System.out.println("Marksheets = " + marksheets);
        
		for (Object M : marksheets) {
			System.out.println("Marksheets = " + M);
			
		}	
	}
}