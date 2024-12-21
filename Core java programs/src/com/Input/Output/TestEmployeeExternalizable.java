package com.Input.Output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeExternalizable {
	
	public static void main(String[] args) throws Exception {

		Employee e = new Employee(1, "rays");
		
		FileOutputStream fs = new FileOutputStream("E:/Core Java/Daily programs/IO/employee.txt");

		// Serialization - employee - 48356201
		ObjectOutputStream out = new ObjectOutputStream(fs);
		
		out.writeObject(e);

		out.close();

		// Deserialization - 48356201 - employee
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:/Core Java/Daily programs/IO/employee.txt"));

		e = (Employee) in.readObject();

		System.out.println(e);

		in.close();
	}

}