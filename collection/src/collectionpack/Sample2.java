package collectionpack;
import java.util.*;

public class Sample2
{
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(45);
	a1.add(35);
	a1.add(25);
	a1.add(85);
	ListIterator li=a1.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}
	
}
}
