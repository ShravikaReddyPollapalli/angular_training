//wap to count no of vowels 
package pack1;
import java.util.Scanner;
public class Prgm3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter string");
	String s1=scan.next();
	int count=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char c1=s1.charAt(i);
		if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
		{
			count++;
		}
	}
	System.out.println("number of vowels present in given string are "+ count);
}
}
