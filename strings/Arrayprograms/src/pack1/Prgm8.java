//wap to count each type of element appearing in an array
package pack1;
import java.util.Scanner;
public class Prgm8 
{
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
	for(int i=0;i<=a1.length-1;i++)
	{
		 int count=0;
		 for(int j=0;j<=a1.length-1;j++)
		 {
			 if(a1[i]==a1[j])
			 {
				 count++;
			 }
		 }
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
		 System.out.println("occurrance of "+a1[i]+"="+count);
		 //sysout(a1[i]+"is appearing"+count+"times");
	}
	
}
}}
