//wap to create double array ,read the size and double elements in runtime
package pack1;
import java.util.Scanner;
public class Prgm2 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array size");
	int size=scan.nextInt();
	System.out.println("enter array elements");
	double[] d1=new double[size];
	for(int i=0;i<=d1.length-1;i++)
	{
		d1[i]=scan.nextDouble();
		}
	System.out.println("array elements are");
	for(double k:d1)
	{
		System.out.println(k);
	}
}
}
