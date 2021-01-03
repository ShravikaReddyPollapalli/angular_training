package pack1;
import java.util.Scanner;
public class Sample1 {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
	System.out.println("enter string");
	String s1=scan.next();
	System.out.println("enter index value");
	int index=scan.nextInt();
	int count=0;
while(true)
		{
		if(count<3)
		{
		try
		{
		System.out.println(s1.charAt(index));
		break;
	}
	catch(StringIndexOutOfBoundsException rv)
	{
		System.out.println("index value should be within the size");
		index=scan.nextInt();
		count++;
	}
}
		else
		{
			System.out.println("all the attempts to get the char is completed");
			break;
		}
		}
}
}


