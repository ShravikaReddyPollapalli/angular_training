package collectionpack;
import java.util.*;
import java.util.Iterator;
public class Sample1
{
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(45);
	a1.add(34);
	a1.add(64);
	a1.add(54);
	a1.add(84);
	ListIterator i1=a1.listIterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	
	while(i1.hasPrevious())
	{
		System.out.println(i1.previous());
	}
}
}
