//wap to create double array & search whether given element is available in the array or not.
	package pack1;
	import java.util.Scanner;
	public class Prgm7
	{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		int size=scan.nextInt();
		System.out.println("enter array elements");
		double[] d1=new double[size];
		for(int i=0;i<=d1.length-1;i++)
		{
		 d1[i]=scan.nextDouble();	
		}
		System.out.println("enter one element");
		double ele=scan.nextDouble();
		int status=0;
		for(int i=0;i<=d1.length-1;i++)
		{
			
			if(ele==d1[i])
			{
				status++;
				break;
			}
		}
		if(status==1)
		{
			System.out.println("element is found");
		}
		else
		{
			System.out.println("element is not found");
		}
}
	}
