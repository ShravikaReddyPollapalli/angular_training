package one;
import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	int temp=n;
	int ld=0;
	int sum=0;
	while(n!=0)
	{
		ld=n%10;
		sum=(ld*ld*ld*ld)+sum;
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("is armstrong");
	}
	else
	{
		System.out.println("not");
	}
}
}
