package collectionpack;
import java.util.ArrayList;
public class Sam1 {
public static void main(String[] args)
{
	ArrayList a1=new ArrayList();
	a1.add(34);
	a1.add(4.5);
	a1.add(45);
	a1.add(23);
	System.out.println(a1);
	System.out.println(a1.size());
	a1.set(1, 6);
	System.out.println(a1);
	a1.remove(1);
	System.out.println(a1);
	a1.add(2,7);
	System.out.println(a1);
	System.out.println(a1.contains(34));
	a1.clear();
	System.out.println(a1);
	System.out.println(a1.isEmpty());
}
}
