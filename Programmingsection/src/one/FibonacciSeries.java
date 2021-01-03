package one;
import java.util.Scanner;
public class FibonacciSeries {
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("entr the number");
	int n=scan.nextInt();
	
	int a=0;int b=1;
	System.out.println(a);
	System.out.println(b);
	for(int i=1;i<=n-2;i++)
	{
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
}
}
