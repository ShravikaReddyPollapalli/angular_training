package package3;
import java.util.*;
public class ArrayList3
{
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
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
