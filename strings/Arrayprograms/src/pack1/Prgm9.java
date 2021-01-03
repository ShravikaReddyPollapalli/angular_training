
//wap to remove duplicates from the array
package pack1;

import java.util.Scanner;

public class Prgm9 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		int size=scan.nextInt();
		System.out.println("enter int elements");
		int[] a1=new int[size];
		
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("elements without duplicate");
		for(int i=0;i<=a1.length-1;i++)
		{
			int status=0;
			 for(int k=i;k>=0;k--)
			 {
				 if(a1[i]==a1[k])
				 {
					 status++;
				 }
			 }
		if(status==1) 
		{
			 System.out.println(a1[i]);
			
		}
	}
	}
	}

