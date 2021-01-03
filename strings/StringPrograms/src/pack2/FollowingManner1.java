package pack2;
//developer-depolever
public class FollowingManner1 {
public static void main(String[] args) {
	String s1="shravikas";
	char c1=s1.charAt(0);
	char c2=s1.charAt(s1.length()-1);
	String s2="";
	for(int i=s1.length()-2;i>=1;i--) {
		char ch=s1.charAt(i);
		s2=s2+ch;
	}
	 String finalstring=c1+s2+c2;
	System.out.println(finalstring);
}
}
