package pack1;
import java.util.Scanner;
//wap to find sum of all the elements in a array
// wap to find first biggest element in a array
//wap to find nth biggest number in a array
public class ArrayPrgm1
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array size");
	int size=scan.nextInt();
	System.out.println("enter int elements");
	int[] a1=new int[size];
	
	int sum=0;
	for(int i=0;i<=a1.length-1;i++)
	{
		a1[i]=scan.nextInt();
	}
	System.out.println();
	for(int i=0;i<=a1.length-1;i++)
	{
		sum=sum+a1[i];
	}
	System.out.println("sum of the elements are "+ sum);
}
}
