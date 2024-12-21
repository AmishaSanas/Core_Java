package com.Input.Output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileWithBufferWriter {
	
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("E:/Core Java/Daily programs/IO/Hello.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		char[] cArray = { 'H', 'i' };

		bw.write(cArray);
		bw.write(',');
		bw.write("SunRays");

		System.out.println("successfully....");

		bw.close();
		fw.close();

	}
}