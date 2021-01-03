//wap to find first biggest element in an array
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
	//big =0
	//if(big<a1[i])
	//big=a1[i]
}
System.out.println("first biggest element "+ big);
}
}
