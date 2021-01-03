package pack;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array size");
	int size=scan.nextInt();
	System.out.println("enter array elements:");
	int[] ele =new int[size];
	for(int i=0;i<=ele.length-1;i++)
	{
		ele[i]=scan.nextInt();
	}
	//int sum=0;
	//for(int i=0;i<=a1.length-1;i++)
 //{
//		sum=sum+a1[i];
//}
//	System.out.println("sum of the given elements"+sum);
	
	
//}


int sum=0;
System.out.println("sum of the unique elements");
for(int i=0;i<=ele.length-1;i++)
{
	int status=0;
	 for(int k=i;k>=0;k--)
	 {
		 if(ele[i]==ele[k])
		 {
			 status++;	 
		 }
	 }
	
if(status==0) 
{
	 sum=sum+ele[i]*ele[i];
	
}
}
System.out.println(sum);
}}