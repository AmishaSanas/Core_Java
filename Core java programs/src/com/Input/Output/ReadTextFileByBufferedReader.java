package com.Input.Output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFileByBufferedReader {
	
	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("E:/Core Java/Daily programs/IO/Hello.txt");
		
		BufferedReader br = new BufferedReader(f);//read text line by line from stream object
		
        String str = br.readLine();
		
		while (str != null) {
			
			System.out.print(str);
			
			str = br.readLine();//returns null if end 
		}
		
		f.close();

	}
}