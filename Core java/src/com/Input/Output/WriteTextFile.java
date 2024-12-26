package com.Input.Output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextFile {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("E:/Core Java/Daily programs/IO/Hello.txt",true);
		
		char[] cArray = {'H','i'};
		
		//fw.write(cArray);
		fw.write(',');
		fw.write("From rays");
		
		fw.close();
		
		System.out.println("Succesfull");
					
	}

}