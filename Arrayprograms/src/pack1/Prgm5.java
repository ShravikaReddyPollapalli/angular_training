//wap to create an int array,and copy this array elements to another array elements.
package pack1;
import java.util.Scanner;
public class Prgm5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array size");
		int size=scan.nextInt();
		System.out.println("enter array elements");
		int[] a1=new int[size];
		/*
		 * for(int i=0;i<=a1.length-1;i++)
		 *  { 
		 *  a1[i]=scan.nextInt(); 
		 *  }
		 *   int[] a2=new int[a1.length];
		 * for(int i=0;i<=a1.length-1;i++) 
		 *  { 
		 *  a2[i]=a1[i];
		 * System.out.println(a2[i]);
		 *  }
		 */
		int[] a2=new int[a1.length];
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=scan.nextInt();
			a2[i]=a1[i];
			}
		System.out.println("elements are");
		/*
		 * for(int k:a1) 
		 * {
		 *  System.out.print(k); 
		 * }
		 */
		for(int i=0;i<=a1.length-1;i++) 
		{
			System.out.println(a1[i]);
		}
		//for(int k:a2)
		//{
			//System.out.print(k);
		//}
		
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println(a2[i]);
		}
}
}