package one;
import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("entr the number");
	int n=scan.nextInt();
	int factor=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			factor++;
		}
	}
	if(factor==2)
	{
		System.out.println("the number is prime number");
	}
	else
	{
		System.out.println("not a prime number");
	}
}
}
