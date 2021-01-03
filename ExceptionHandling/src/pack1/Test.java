package pack1;
import java.util.*;
public class Test {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String s1=scan.next();
	System.out.println("enter the index value");
	int i1=scan.nextInt();
	char ch=s1.charAt(i1);
	System.out.println(ch);
}
}
