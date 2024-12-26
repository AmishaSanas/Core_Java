package com.Input.Output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWriteBinaryData {
	
	public static void main(String[] args)throws Exception {
		
		String source = "C://Users//amish_fq1req3//Pictures//Screenshots//Screenshot 2024-11-16 001335.png//";
		
		String target = "E:/Core Java/Daily programs/IO/Screenshot.png//";
		
		FileInputStream r = new FileInputStream(source);
		FileOutputStream w = new FileOutputStream(target);
		
		int i = r.read();
		
		while (i != -1) {
			System.out.println(i);
			w.write(i);
			i = r.read();
			
		}
		System.out.println("copy successfully...");

		 r.close();
		 w.close();
		
	}
}