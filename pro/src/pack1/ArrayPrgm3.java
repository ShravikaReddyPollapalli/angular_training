package pack1;
import java.util.Scanner;
public class ArrayPrgm3
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter array size");
int size=scan.nextInt();
System.out.println("enter array elements");
int[] a1=new int[size];

int n=scan.nextInt();
int greaterThan=a1.length-n;
for(int i=0;i<=a1.length-1;i++)
{
	int count=0;
	for(int j=0;j<=a1.length-1;j++)
	{
		if(a1[i]>a1[j])
		{
			count++;
		}
	}
if(count==greaterThan)
{
System.out.println(a1[i]+"is"+n+"biggest element");
break;
}
}
}
}
