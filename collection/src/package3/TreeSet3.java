
package package3;


import java.util.*;

public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet a1=new TreeSet();
		a1.add(2.2);
		a1.add(2.4);
		a1.add(4.3);
		a1.add(5.6);
		Iterator ls=a1.iterator();
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
		
}
}