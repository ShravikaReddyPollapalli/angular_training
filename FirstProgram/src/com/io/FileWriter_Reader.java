package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Reader {
public static void main(String[] args) throws Exception {
	FileWriter fw = new FileWriter("b.txt");
	fw.write("welcome to java");
	fw.close();
	FileReader fr = new FileReader("b.txt");
	int i;
	while((i = fr.read()) != -1) //-1 is like end of file i.e.,read till end of file.
		System.out.print((char)i);
	fr.close();
}
}
//sir will read method returns ascii value of the character?


//if i=-1 then only while loop terminates right ,when did i value becomes -1


//when it returned null i think


//ASCII value of null is -1 ?