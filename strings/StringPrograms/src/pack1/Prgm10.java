//sum of all the digits present in given string
package pack1;
//import java.util.Scanner;
public class Prgm10 {
	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		//System.out.println("enter string");
		//String s1=scan.next();
		String s1="shra3hi4bye5";
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c1=s1.charAt(i);
			boolean status=Character.isDigit(c1);
			if(status==true)
			{
				String s2=c1+"";
				int k=Integer.parseInt(s2);
				sum=sum+k;
			}
		}
		System.out.println("the sum of the given digits present in string:"+sum);
	}
}
