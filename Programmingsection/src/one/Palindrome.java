package one;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
			System.out.println("enter the number");
	int n=scan.nextInt();
	int temp=n;
	int rem=0;
	int rev=0;
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==temp)
	{
		System.out.println("is");
	}
	else
	{
		System.out.println("not");
	}
}
}
