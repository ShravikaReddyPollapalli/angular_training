package assignment;
import java.util.*;
public class Firstt {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	Scanner scan=new Scanner(System.in);
	int choice=0;
	do
	{
		System.out.println("enter the type");
		int type=scan.nextInt();
		if(type==1)
		{
			System.out.println("enter int element");
			a1.add(scan.nextInt());
		}
		if(type==2)
		{
			System.out.println("enter double element");
			a1.add(scan.nextDouble());
		}
		if(type==3)
		{
			System.out.println("enter char element");
			a1.add(scan.next().charAt(0));
		}
		if(type==4)
		{
			System.out.println("enter string element");
			a1.add(scan.next());
		}
		System.out.println("enter 1 to continue/0 to stop");
		choice=scan.nextInt();
		}
	while(choice==1);
	System.out.println(a1);
	
	}
}

