package pack2;
import java.util.Scanner;
public class T {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array size");
	int size=scan.nextInt();
	System.out.println("enter array elements");
	String[] a1=new String[size];
	for(int i=0;i<=a1.length-1;i++)
	{
		a1[i]=scan.next();
	}
	for(int i=0;i<=a1.length-1;i++)
	{
		System.out.println(a1[i]);
	}
}
}
