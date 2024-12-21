package com.Input.Output;

import java.io.Serializable;

public class Student implements Serializable {
	
	transient int id; //its value is not saved during serialization. 
	String name;

	public Student() {
	}

	public Student(int id, String name) {

		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + "";
	}

}