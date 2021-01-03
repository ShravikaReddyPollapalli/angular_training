package pack2;

public class StringArray {
public static void main(String[] args) {
	String[] s1=new String[3];
	s1[0]="sam";
	s1[1]="sony";
	s1[2]="sam1";
	for(int i=0;i<=s1.length-1;i++)
	{
		System.out.println(s1[i]);
	}
	//
	String[] s= {"sow","sam","son"};
	for(int i=0;i<=s.length-1;i++)
	{
		System.out.println(s[i]);
	}
	//to print the string
		String s11="shra";
		for(int i=0;i<=s11.length()-1;i++)
		{
			char c11=s11.charAt(i);
			System.out.println(c11);
		}
		
	//to reverse the string with empty string
	String S="deve";
	String S1="";
	for(int i=S.length()-1;i>=0;i--)
	{
		char C=S.charAt(i);
		S1=S1+C;
	}
	System.out.println(S1);
	
	
	//to reverse the string
	String s4="shra";
	for(int i=s4.length()-1;i>=0;i--)
	{
		char c6=s4.charAt(i);
		System.out.println(c6);
	}
		/*
		 * wrong
		 * 
		 * String s5="developer"; 
		 * for(int i=0;i<=s5.length()-1;i++) {
		 * System.out.println(s5); }
		 */
	
	//to convert string array to char array
		String s2="sow";
		char[] c1=s2.toCharArray();
		for(int i=0;i<=s2.length()-1;i++)
		{
			System.out.println(c1[i]);
		}
		
		
	//to reverse the string using array
	String s6="love";
	String s7="";
	char[] c6=s6.toCharArray();
	for(int i=c6.length-1;i>=0;i--)
	{
		s7=s7+c6[i];
	}
	System.out.println(s7);
	
	
}
}

