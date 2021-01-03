package pack1;



import java.util.Scanner;
public class Occurance {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s1="aeiou";
	System.out.println("enter the String");
	String s2=scan.next();
	 String ls=s2.toLowerCase();
	 int count=0;
	for(int i=0;i<=ls.length()-1;i++)
	{
		char c1=ls.charAt(i);
		for(int j=0;j<=s1.length()-1;j++)
		{
		    char c2=s1.charAt(j);
		    if(c2==c1)
		    {
		    	count++;
		    }
		    else
		    {
		    	break;
		    }
		    System.out.println(c2+"count"+count);
		}
	}
}
}
