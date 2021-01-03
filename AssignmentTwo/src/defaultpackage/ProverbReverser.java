package defaultpackage;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ProverbReverser {
	public static void main(String[] args) throws Exception{
		FileReader f = new FileReader("/home/ubuntu/proverb/TopProverbs.txt");
		FileOutputStream f1 = new FileOutputStream("/home/ubuntu/proverb/ReverseProverbs.txt");
		BufferedReader bf = new BufferedReader(f);
		BufferedOutputStream bff = new BufferedOutputStream(f1);
		String data;
		while((data = bf.readLine())!=null) {
			String[] str = data.split("//s+");
			for(String s : str) {
				String str1 = reverseWord(s);
				bff.write(str1.getBytes());
				String str2 = " ";
				bff.write(str2.getBytes());
			}
		}
		bff.close();
		f1.close();
		bf.close();
	}
	public static String reverseWord(String s) {
		String rev = " ";
		for(int j=s.length()-1;j>=0;j--) {
			rev+=s.charAt(j);
		}
		return rev;
	}
}
