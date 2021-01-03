package com.capg.abhi.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
public static void main(String[] args) {
	try {
		FileOutputStream f1 = new FileOutputStream("C:\\Users\\salla\\Desktop\\shra.txt");
		//data into this file
		String personInfo = "hi hello";
		byte[] b = personInfo.getBytes();
		
		f1.write(b);
		System.out.println("file created successfully");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
