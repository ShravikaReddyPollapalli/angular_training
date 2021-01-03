
package pack1;
import java.util.Scanner;
public class Prgm6
{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter size of 1st array elements");
	int size1=scan.nextInt();
	System.out.println("enter array elements");
	int[] a1=new int[size1];
	for(int i=0;i<=a1.length-1;i++)
	{
	 a1[i]=scan.nextInt();	
	}
	System.out.println("enter size of 2nd array elements");
	int size2=scan.nextInt();
	System.out.println("enter array elements");
	int[] a2=new int[size2];
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
	System.out.println("the array elements are");
	for(int l:a3)
	{
		System.out.println(l);
	}
}
}