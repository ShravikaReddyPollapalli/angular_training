package demo;

import java.util.Scanner;

public class Second
{
	static String s="";
	static char[] c=new char[s.length()];
	 static int digit=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String s = scan.next();
		 
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			if((c>='0')&&(c<='9')) {
				digit++; 
			}
		}
		System.out.println(digit);
		
		System.out.println(digitPer());
		}

public static double digitPer()
{
		
		try
		{
			double percent=(digit*100)/s.length();
		}
		catch( ArithmeticException ae)
		{
			
		}
		return percent;
	}
}