package pack1;

public class B {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("durga");
	sb.append("devi");
	System.out.println(sb);
	
	StringBuffer sb1 =  new StringBuffer("durgadevi");
	StringBuffer sb2 =  new StringBuffer("durgadevi");
	System.out.println(sb1==sb2);  //false   ref comp
	System.out.println(sb1.equals(sb2)); //false    ref comp bcoz equals() is not overridden
	 
}
}
