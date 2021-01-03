package pack1;
//to remove the spaces btw the start or end of the string we use trim method
import java.util.Scanner;

public class Trim {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your city name");
	String name=sc.nextLine().toLowerCase().trim();
	if (name.equals("hyderabad"))
	{
		System.out.println("hello hyderabadi");
	}
	else if(name.equals("chennai"))
	{
		System.out.println("hello madrasi");
	}
	else if (name.equals("banglore"))
	{
		System.out.println("hello kanandian");
	}
	else
	{
		System.out.println("please enter a valid city name");
	}
//	String s = "durga soft";
//	System.out.println(s.length());
//	System.out.println(s.trim().length());
}
}
