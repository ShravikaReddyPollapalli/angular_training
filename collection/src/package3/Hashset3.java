package package3;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset3 {
	public static void main(String[] args) {
		HashSet a1=new HashSet();
		a1.add(3.2);
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