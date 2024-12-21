package com.Input.Output;

import java.io.File;
import java.util.Date;

public class TestFileInfo { //Examine File 
	
	public static void main(String[] args) {
		
		File f = new File("E:/Core Java/Daily programs/IO/Hello.txt");//Create file object
		
		System.out.println("Is file Available = " + f.exists());
		
		if (f.exists()) {
			
		System.out.println("file name: " + f.getName());
		
		System.out.println("Path of file = " + f.getAbsolutePath());
		
		System.out.println("can write this file: " + f.canWrite());
		
		System.out.println("can read this file: " + f.canRead());
		
		//Check if it is a directory or a file
		System.out.println("Is file: " + f.isFile());
		System.out.println("Is Dir: " + f.isDirectory());
		
		//Length of File
		Long length = f.length();
		System.out.println("Length: " + length + " bytes");
		
		//Last modified date of file
		
			Date d = new Date(f.lastModified());
			System.out.println("last modified: " + d);
			
		} else {

			System.out.println("file not found");
		}		
	}
}