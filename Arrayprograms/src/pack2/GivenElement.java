package pack2;
import java.util.Scanner;
public class GivenElement {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array size");
	int size=scan.nextInt();
	System.out.println("enter array elements");
	int[] a1=new int[size];
	for(int i=0;i<=a1.length-1;i++)
	{
		a1[i]=scan.nextInt();
	}
	int ele=scan.nextInt();
	int status=0;
	for(int i=0;i<=a1.length-1;i++)
	{
		if(ele==a1[i])
	{
		status++;
		break;
	}
		
	}
	
	if(status==1)
	{
		System.out.println("ele is found");
	}
	else
	{
		System.out.println("ele is not found");
	}
}
}