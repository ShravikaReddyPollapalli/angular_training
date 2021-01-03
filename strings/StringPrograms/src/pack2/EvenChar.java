package pack2;

import java.util.Scanner;

public class EvenChar {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String s1=scan.next();
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(i%2==0)
{
			char ch=s1.charAt(i);
			System.out.println(ch);
				}
		}
}
}