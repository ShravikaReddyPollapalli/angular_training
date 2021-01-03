
package demo;
import java.util.*;

public class Sample2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter thr string");
	String s1=scan.next();
	char c[]=new char[s1.length()];
	for(int i=0;i<=s1.length()-1;i++) {
		c[i]=s1.charAt(i);
	}
	int count=0;
	String fina="";
	for(int j=0;j<=c.length-1;j++) {
		for(int k=j;k>0;k--) {
			if(j==k) {
				count++;
			}
		}
		fina=count+""+s1.charAt(j);
	}
	System.out.println(fina);
}
}
