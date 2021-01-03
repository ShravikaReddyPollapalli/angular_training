package pack2;

import java.util.Scanner;

public class PalindromewithoutReverse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.next();
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
	}
}
