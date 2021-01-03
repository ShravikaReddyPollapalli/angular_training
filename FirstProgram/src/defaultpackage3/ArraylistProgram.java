package defaultpackage3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistProgram {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> memory = new ArrayList<String>();
	
	while(true) {
		memory.add(sc.nextLine());
		 if((memory.get(memory.size()-1)).equals("clear")) {
			 memory.clear();
		 } else {
			 if((memory.get(memory.size()-1)).equals("END"))
				 break;
		 }
		 System.out.println(memory.toString());
	}
 }
}
