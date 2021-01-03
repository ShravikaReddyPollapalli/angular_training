package assignment;
import java.util.*;
public class Firstttt {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	Scanner scan=new Scanner(System.in);
	int choice=0;
	do
	{
		System.out.println("enter int element");
		l1.add(scan.nextInt());
		System.out.println("enter 1 to continue/0 to stop");
		choice=scan.nextInt();
	}while(choice==1);
		System.out.println("enter the index to be retrived");
	int index=scan.nextInt();
	if(index<=l1.size()-1)
	{
		System.out.println(l1.get(index));
	}
	else
	{
		System.out.println("index you have entered is not available");
	}
}
}
