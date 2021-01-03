// to print count of each vowel present in given string
package pack1;
import java.util.Scanner;
public class Prgm9 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter string");
	String s1=scan.next();
	int acount=0;
	int ecount=0;
	int icount=0;
	int ocount=0;
	int ucount=0;
	for(int i=1;i<=s1.length()-1;i++)
	{
		char c1=s1.charAt(i);
		if(c1=='a')
		{
			acount++;
			
		}
		else if(c1=='e')
		{
			ecount++;
		}
		else if(c1=='i')
		{
			icount++;
		}
		else if(c1=='o')
		{
			ocount++;
		}
		else if(c1=='u')
		{
			ucount++;
		}
	}
System.out.println("a present in given string "+acount);
System.out.println("e present in given string "+ecount);
System.out.println("i present in given string "+icount);
System.out.println("o present in given string "+ocount);
System.out.println("u present in given string "+ucount);
}
}
