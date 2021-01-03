// to count the no of digits
package pack1;
import java.util.Scanner;
public class Prgm5
{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter string");
	String s1=scan.next();
	int count=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char c1=s1.charAt(i);
		//boolean status==Character.isDigit();
		if(Character.isDigit(c1)==true)
		{
			count++;
		}
	}
	System.out.println(count);
}
}
