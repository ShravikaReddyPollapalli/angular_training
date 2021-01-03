package pack1;

public class Methods {
public static void main(String[] args) {
	String s = "durga";
	System.out.println(s.charAt(3));
//	System.out.println(s.charAt(30));
//	s=s.concat("software");
//	s=s+"software";
	s += "software";
	System.out.println(s);
	String s1 = "DURGA";
	System.out.println(s1.equals("durga"));
	System.out.println(s1.equalsIgnoreCase("durga"));
	String s2=" ";
	System.out.println(s2.isEmpty()); //true
	String S3 = "durga";
	System.out.println(S3.isEmpty()); //false
	String s3 = "durga";
	System.out.println(s3.length());
	System.out.println(s3.substring(3));
	System.out.println(s3.substring(1,3));
	
	String s4="durga";
	System.out.println(s4.indexOf('r'));
	System.out.println(s4.indexOf('z'));
	String s5="babbab";
	System.out.println(s5.indexOf('a'));
	System.out.println(s5.lastIndexOf('a'));
}
}
//public char charAt(int index)
//public String concat(String s)
//public boolean equals(Object 0) to check the content and it is overrided version
//public boolean equalsIgnoreCase(String s) where case is ignored
//username -equalsIgnoreCase()
//pwd-equals()
//public boolean isEmpty()
//public int length()
//length variable is for array
//length() is for Strings
//int[] x = {1,2,3,4};
//sysout(x.length)
