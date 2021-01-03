package com.io;

import java.io.File;
import java.io.IOException;

public class FileProgram {
public static void main(String[] args) {
	
	try {
		File obj = new File("b.txt");
		if(obj.createNewFile())
			System.out.println("file created");
		else
			System.out.println("already exists");
		
		
		System.out.println(obj.getAbsolutePath());
		System.out.println(obj.isFile());
		
		File obj1 = new File("C:\\Users\\charan\\Documents\\workspace-spring-tool-suite-4-4.8.0.RELEASE\\FirstProgram");
		String []arr = obj1.list();
		for(String a : arr)
			System.out.println(a);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
