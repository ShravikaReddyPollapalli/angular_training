package demo;

import java.util.*;

public class Third
{
	static int upper=0;
	static int lower=0;
	static int digit=0;
	static int spl=0;
	
	static String s="";
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the String");
	 s=scan.next();
	
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		
		if((c>='A')&&(c<='Z')) {
			upper++;
		}
		else if((c>='a')&&(c<='z')) {
			lower++;
		}
		
		else if((c>='0')&&(c<='9')) {
			digit++;
		}
		else {
			spl++;
		}
		}
	System.out.println(upper);
	System.out.println(lower);
	System.out.println(digit);
	System.out.println(spl);
	System.out.println(upperPer());
	System.out.println(lowerPer());
	System.out.println(digitPer());
	System.out.println(splPer());
}
	public static double upperPer()
	{
		double percent=(upper*100)/s.length();
		return percent;
	}
	public static double lowerPer()
			 {
		double percent=(lower*100)/s.length();
		return percent;
		
	}
	public static double digitPer()
	{
		double percent=(digit*100)/s.length();
		return percent;
	}
	public static double splPer() 
	{
		double percent=(spl*100) /s.length();
		return percent;
		
	}
}

