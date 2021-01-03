package package4;

import java.util.Vector;
import java.util.ListIterator;

public class Vector4 {
public static void main(String[] args) {
		
		
		Vector a1=new Vector();
		a1.add('a');
		a1.add('s');
		a1.add('d');
		a1.add('f');
		ListIterator ls=a1.listIterator();
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
		while(ls.hasPrevious())
		{
			System.out.println(ls.previous());
		}
	}
}


