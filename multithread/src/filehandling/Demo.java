package filehandling;
import java.io.File;
public class Demo {
public static void main(String[] args) {
	File f1=new File("C:/filestorage");
	boolean status=f1.mkdir();
	System.out.println(status);
}
}
