package package4;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList4
{
	public static void main(String[] args) {
		
	
	ArrayList a1=new ArrayList();
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