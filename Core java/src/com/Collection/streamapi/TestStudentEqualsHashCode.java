package com.Collection.streamapi;

public class TestStudentEqualsHashCode {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Ram", "Indore");
		Student s2 = new Student(1, "Ram", "Indore");
		//Employee e = new Employee("ramesh", "indore");
		
		System.out.println(s1.equals(s2));//Equal
		//System.out.println(s1.equals(e)); //not Equal
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//System.out.println(e.hashCode());
		
	}

}
