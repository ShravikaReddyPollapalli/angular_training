//wap to count given char in a string
package pack1;
import java.util.Scanner;
public class Prgm2 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.next();
		System.out.println("enter char ");
		String s2=scan.next();
		char c1=s2.charAt(0);
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c2=s1.charAt(i);
			if(c1==c2)
			{
				count++;
			}
		}
		System.out.println("number of given characters are "+count);
	}
}
