package pack1;
import java.util.Scanner;
public class Sample2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first value");
		int a=scan.nextInt();
		System.out.println("enter second value");
		int b=scan.nextInt();
		while(true)
			{
			try
			{
				System.out.println(a/b);
				break;
			}
			catch(ArithmeticException rv)
			{
				System.out.println("deno cannot be zero,re-enter another value");
				b=scan.nextInt();
				}
			}
			}
	

}
