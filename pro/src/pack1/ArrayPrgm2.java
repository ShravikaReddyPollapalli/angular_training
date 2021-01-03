package pack1;
import java.util.Scanner;
public class ArrayPrgm2
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter array size");
int size=scan.nextInt();
int[] a1=new int[size];
System.out.println("enter array elements");
int big=0;
for(int i=0;i<=a1.length-1;i++)
{
	a1[i]=scan.nextInt();
}

for(int i=0;i<=a1.length-1;i++)
	{
	if(big<a1[i])
	{
	big=a1[i];
	}
}
System.out.println("first biggest element "+ big);
}
}
