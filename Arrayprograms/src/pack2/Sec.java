package pack2;

import java.util.Scanner;

public class Sec {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array size");
	int size=scan.nextInt();
	System.out.println("enter array elements");
	int[] a1=new int[size];
	for(int i=0;i<=a1.length-1;i++)
	{
		 a1[i]=scan.nextInt();
	}
	int big=a1[0];
	for(int i=0;i<=a1.length-1;i++)
	{
	if(a1[0]<a1[i])
	{
		big=a1[i];
	}
	}
	System.out.println(big);
}
}
