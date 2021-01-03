package pack1;
/// wap to sort the given array

import java.util.Scanner;

public class Prgm11
{
public static void main(String[] args) {
Scanner scan=new  Scanner(System.in);
System.out.println("enter array size");
int size=scan.nextInt();
System.out.println("enter array elements");
int[] a1=new int[size];
for(int i=0;i<=a1.length-1;i++)
{
	a1[i]=scan.nextInt();

}
int temp=0;
for(int c=1;c<=a1.length-1;c++)
{
	for(int i=0;i<=a1.length-2;i++)
	{
		if(a1[i]>a1[i+1])
		{
			temp=a1[i];
			a1[i]=a1[i+1];
			a1[i+1]=temp;
		}
	}
}
System.out.println("sorted elements");
//for(int k:a1) 
//{
//System.out.println(k);
//}
for(int i=0;i<=a1.length-1;i++)
{
	System.out.println(a1[i]);
}
}
}