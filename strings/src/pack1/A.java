package pack1;

public class A {
public static void main(String[] args) {
	String string =	new String("durga");
       string.concat("devi");   
       System.out.println(string); //durga

//String hi=string.concat("devi");
//System.out.println(hi);

//== operator and equals()
 String s1 = new String("durga");
 String s2 = new String("durga");
 System.out.println(s1==s2);   //false    ref comparison
 System.out.println(s1.equals(s2)); //true   content
}
}