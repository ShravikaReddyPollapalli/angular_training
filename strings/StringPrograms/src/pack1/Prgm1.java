//wap to print the digits present in given string
package pack1;
import java.util.Scanner;
public class Prgm1 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=scan.next();

		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			boolean  c1=Character.isDigit(ch);
			if(c1==true)
			{
				System.out.println(ch);
			}
		}

	}
}
