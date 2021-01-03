//wap to create char array and print in reverse order.
package pack1;
import java.util.Scanner;
public class Prgm4 
{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array size");
	int size=scan.nextInt();
	System.out.println("enter array elements");
	char[] c1=new char[size];
	for(int i=0;i<=c1.length-1;i++)
	{
		c1[i]=scan.next().charAt(0);
	}
	System.out.println("array elements are");
		
		  for(int i=c1.length-1;i>=0;i--) 
		  {
			  System.out.println(c1[i]);
			  }
		 
//	for(char k:c1)
//	{
//		System.out.println(k);
//	}
}
}
