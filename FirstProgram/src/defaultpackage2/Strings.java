package defaultpackage2;

public class Strings {
public static void main(String[] args) {
	String str = new String("burger");
	String json = new String("pizza");
	System.out.println(str);
	System.out.println(json);
	
	
//	-------string , builder and buffer
	
	String s = "localhost";
	s.concat("hai");
	String s2 = s.concat("hai");
	System.out.println(s2);
}
}
