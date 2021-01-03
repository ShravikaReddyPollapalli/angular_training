package defaultpackage;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ProverbReader {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("/home/ubuntu/proverb/TopProverbs.txt");
		BufferedInputStream bf = new BufferedInputStream(f);
		int i;
		while((i = bf.read())!= -1) {
			System.out.print((char)i);
		}
		bf.close();
		f.close();
	}

}
