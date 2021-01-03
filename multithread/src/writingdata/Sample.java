
package writingdata;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.*;
public class Sample {
public static void main(String[] args) throws Exception
{
	File f1=new File("C:/filestorage/data.txt");
	f1.createNewFile();
	Scanner scan=new Scanner(System.in);
	FileWriter fw=new FileWriter(f1);
	fw.write(scan.next());
	fw.close();
	System.out.println("writing is sucessful");
}
}
