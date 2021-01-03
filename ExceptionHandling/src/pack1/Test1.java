package pack1;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String s1=scan.next();
	System.out.println("enter the index");
	int i1=scan.nextInt();
	int count=0;
	while(true)
	{
		if(count<3) {
		try {
			System.out.println(s1.charAt(i1));
			break;
		}
		catch(StringIndexOutOfBoundsException sv)
		{
			System.out.println("entered index value should be within the range");
			i1=scan.nextInt();
			count++;
		}
	}
	else
	{
		System.out.println("all the attempts to get char is completetd");
		break;
	}
}
}
}
