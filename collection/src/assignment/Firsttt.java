package assignment;
import java.util.*;
public class Firsttt {
public static void main(String[] args) {
	Vector v1=new Vector();
	Scanner scan=new Scanner(System.in);
	int choice=0;
	do {
		System.out.println("enter double element");
		v1.add(scan.nextDouble());
		System.out.println("enter 1 to continue/0 to stop");
		choice=scan.nextInt();
	}
	while(choice==1);
	System.out.println("enter index value to be removed");
	int index=scan.nextInt();
	if(index<=v1.size()-1)
	{
		v1.remove(index);
	}
	else
	{
		System.out.println("index no.you have entered is not available");
	}
	System.out.println(v1);
}
}
