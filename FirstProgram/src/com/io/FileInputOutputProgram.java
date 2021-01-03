package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputProgram {
public static void main(String[] args) throws Exception {
	FileOutputStream o = new FileOutputStream("a1.txt");
	o.write("welcome".getBytes());
	o.close();
	FileInputStream o1 =  new FileInputStream("a1.txt");
	int i;
	while( (i = o1.read()) != -1)
		System.out.print((char)i);
	o1.close();
}
}
