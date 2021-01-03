package demo;


public class First {
public static void main(String[] args) {
	
	String s="UPPER";
	char[] c=s.toCharArray();
	for(int i=0;i<=s.length()-1;i++)
	{
		if(c[i]>='A'&&c[i]<='Z')
		{
			c[i]=(char) (c[i]+32); 
		}
		
		System.out.print(c[i]);
     }
	
}
}
