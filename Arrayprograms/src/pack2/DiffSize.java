package pack2;

import java.util.Scanner;

public class DiffSize {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1st array size");
		int size=scan.nextInt();
		System.out.println("enter array elements");
		int[] a1=new int[size];
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("enter second array size");
		int size1=scan.nextInt();
		System.out.println("enter array elements");
		int[] a2=new int[size1];
		for(int i=0;i<=a2.length-1;i++)
		{
			a2[i]=scan.nextInt();
		}
		int[] a3=new int[a1.length+a2.length];
		for(int i=0;i<=a1.length-1;i++)
		{
			a3[i]=a1[i];
		}
		int k=a1.length;
		for(int j=0;j<=a2.length-1;j++)
		{
			a3[k]=a2[j];
			k++;
		}
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println(a3[1]);
		}
			
}
}