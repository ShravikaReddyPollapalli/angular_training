package filehandling;
import java.io.*;
public class Demo1 {
public static void main(String[] args) throws IOException
{
	File f1=new File("C:/filestorage/data.txt");
	boolean status=f1.createNewFile();
	System.out.println(status);
}

 

}
