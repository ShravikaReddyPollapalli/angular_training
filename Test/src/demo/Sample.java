package demo;
import java.util.*;


public class Sample {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the size number");
	int size=scan.nextInt();
	System.out.println("enter array values");
	int[] array=new int[size];
	for(int k=0;k<=array.length-1;k++) {
		array[k]=scan.nextInt();
	}
	int count=0;
	for(int i=0;i<=array.length-1;i++) {
		for(int j=i;j>0;j--) {
			if(i%j==0) {
				System.out.println();
			}
		}
		
		/*if(count==2) {
			System.out.println(i);
		}
	}}*/
}
}}
