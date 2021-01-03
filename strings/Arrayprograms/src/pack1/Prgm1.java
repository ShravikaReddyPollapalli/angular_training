 //wap to create an int array and provide array size & array elements during runtime
package pack1;
import java.util.Scanner;
public class Prgm1 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array size");
	int size=scan.nextInt();
	System.out.println("enter array elements");
	int[] a1=new int[size];
	for(int i=0;i<=a1.length-1;i++)
	{
		a1[i]=scan.nextInt();
	}
		
		  System.out.println("array elements are");
		  for(int i=0;i<=a1.length-1;i++)
		  {
			  System.out.println(a1[i]);
		  }
		/*
		 * for(int k:a1) { System.out.println(k); }
		 */
		 
	
}
}