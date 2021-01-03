package package3;


import java.util.*;

public class PriorityQueue3 {
	public static void main(String[] args) {
		PriorityQueue a1=new PriorityQueue();
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
