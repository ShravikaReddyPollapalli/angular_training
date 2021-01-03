package one;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scan.nextInt();
	int rem=0;
	int rev=0;
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println(rev);
	
}
}
