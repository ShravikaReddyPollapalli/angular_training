package defaultpackage;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ProverbCollection {
	public static void storeProverb(String proverb) throws Exception {
		FileOutputStream f = new FileOutputStream("/home/ubuntu/proverb/TopProverbs.txt",true);
		BufferedOutputStream bf = new BufferedOutputStream(f);
		bf.write(proverb.getBytes());
		String s = " ";
		bf.write(s.getBytes());
		bf.close();
	}
	
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String proverb = sc.nextLine();
			if(proverb.equals("STOP")) {
				break;
			}
			else {
				try {
					storeProverb(proverb);
				}
				catch(Exception e) {
					System.out.println(e);
					
				}	
			}
		}
		sc.close();
		
	}
}
