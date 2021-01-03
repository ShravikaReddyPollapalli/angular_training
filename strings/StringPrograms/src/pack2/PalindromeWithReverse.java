package pack2;

import java.util.Scanner;

public class PalindromeWithReverse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		System.out.println(s2);
		if(s2.equalsIgnoreCase(s1))
		{
			System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
}
}
