package pack1;

public class Final {
public static void main(String[] args) {
	System.out.println("main starts");
	int a=10;
	int b=0;
	
	
	try
	{
		System.out.println("in try block");
		System.out.println(a/b);
	}
	catch(ArithmeticException rv)
	{
		System.out.println("in catch block");
		b=5;
		//System.out.println(a/b);
	}
	
	finally
	{
		System.out.println("in finally block");
}}
}
