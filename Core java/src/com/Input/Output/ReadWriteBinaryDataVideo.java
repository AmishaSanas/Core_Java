package com.Input.Output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteBinaryDataVideo {
	
	public static void main(String[] args) throws Exception {

		String source = "C:/Users/amish_fq1req3/Pushpa 2 (2024) V3 .[ Tgm - @VQLSE_Bot ] 1080p(480P version).mov";
		String target = "E:/Core Java/Daily programs/IO/Pushpa.mov";

		BufferedInputStream br = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(target));

		int i = br.read();

		while (i != -1) {

			System.out.println(i);

			bw.write(i);

			i = br.read();

		}

		System.out.println("copy successfully...");
		br.close();
		bw.close();
	}
}