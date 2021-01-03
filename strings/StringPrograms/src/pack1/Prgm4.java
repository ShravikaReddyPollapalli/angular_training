//wap to print all the vowels
package pack1;
import java.util.Scanner;
public class Prgm4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter string ");
	String s1=scan.next();
	for(int i=0;i<=s1.length()-1;i++)
	{
	char c1=s1.charAt(i);
	if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
		{
		 System.out.print(c1);
		}
	}
}
}
