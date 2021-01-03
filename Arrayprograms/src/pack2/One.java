package pack2;
import java.util.Scanner;
public class One {
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
	
	int sum=0;
	for(int i=0;i<=a1.length-1;i++)
	{
		sum=sum+a1[i];
	}
	System.out.println(sum);
}
}
