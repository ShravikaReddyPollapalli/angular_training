package defaultpackage;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File f = new File("/home/ubuntu/testing files","badminton");
			f.mkdir();
			File f1 = new File("/home/ubuntu/testing files/badminton","singles.txt");
			f1.createNewFile();
			File f2 = new File("/home/ubuntu/testing files/badminton","dubbles.txt");
			f2.createNewFile();
			File f3 = new File("/home/ubuntu/testing files/badminton","courts");
			f3.mkdir();
			File f4 = new File("/home/ubuntu/testing files/badminton/courts","smash.dat");
			f4.createNewFile();
			File f5 = new File("/home/ubuntu/testing files/badminton","doubles.txt");
			f2.renameTo(f5);
	}
}
