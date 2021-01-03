package com.capg.abhi.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class FileInput {
public static void main(String[] args) {
	try {
		FileInputStream f1 = new FileInputStream("C:\\Users\\salla\\Desktop\\shra.txt");
	 
//	int j = 0;
//	while((j=fileInputStream.read()) != -1) {
//		System.out.println((char)j);
//	}
//	
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
