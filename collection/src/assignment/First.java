package assignment;
import java.util.*;
public class First {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	Scanner scan=new Scanner(System.in);
	int choice=0;
	do
	{
		System.out.println("enter int element");
		a1.add(scan.nextInt());
		System.out.println("press 1 to continue/0 to stop");
		choice=scan.nextInt();}
		while(choice==1);
		System.out.println(a1);
	
}
}
