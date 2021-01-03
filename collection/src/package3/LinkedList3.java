package package3;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList a1=new LinkedList();
		a1.add(3.2);
		a1.add(2.4);
		a1.add(4.3);
		a1.add(0.6);
		Iterator ls=a1.iterator();
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
	}
}
