package com.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Businessman b = new Businessman();
		Doctor d = new Doctor();
		Student s = new Student();

		b.setName("Ram");
		b.setAddress("Indore");
		b.setIncome(70000.00);
		b.setDateOfBirth(sdf.parse("2000-11-06"));

		System.out.println("Businessman Name = " + b.getName());
		System.out.println("Businessman Address = " + b.getAddress());
		System.out.println("Businessman Income = " + b.getIncome());
		System.out.println("Businessman Dob = " + b.getDateOfBirth());
		System.out.println("------------------------");

		
		d.setName("Sharma");
		d.setAddress("Bhopal");
		d.setDateOfBirth(sdf.parse("2002-12-18"));
		d.setRegistrationNo("RN1");

		System.out.println("Doctor Name = " + d.getName());
		System.out.println("Doctor Address = " + d.getAddress());
		System.out.println("Doctor Dob = " + d.getDateOfBirth());
		System.out.println("Doctor Registration No = " + d.getRegistrationNo());
		System.out.println("------------------------");
		
		s.setName("Amisha");
		s.setAddress("Puna");
		s.setDateOfBirth(sdf.parse("2005-05-08"));
		s.setMarks(86);
		s.setRollNo("A12");
		
		System.out.println("Student Name = " + s.getName());
		System.out.println("Student Address = " + s.getAddress());
		System.out.println("Student Dob = " + s.getDateOfBirth());
		System.out.println("Student Marks = " + s.getMarks());
		System.out.println("Student Roll No = " + s.getRollNo());
	}
}
