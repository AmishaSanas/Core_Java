package com.Input.Output;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFile {
	
	public static void main(String[] args) throws Exception {
		
		//read character stream from text file
		FileReader f = new FileReader("E:/Core Java/Daily programs/IO/Hello.txt");
		
        int i = f.read();//read char
		
		char c;
		
		while(i != -1) {//i is -1 if no more char is left in file
			
			c = (char) i;//type cast to char
			
			System.out.print(c);
			
			i = f.read();//read next character
			
		}
		
		f.close();	
	}
}