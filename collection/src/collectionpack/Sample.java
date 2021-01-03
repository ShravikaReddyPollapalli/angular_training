package collectionpack;
import java.util.ArrayList;

public class Sample {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	a1.add(5);
	a1.size();
	System.out.println(a1.size());
	System.out.println(a1.get(3));
	a1.set(3, 6);
	System.out.println(a1);
	a1.remove(2);
	System.out.println(a1);
	a1.add(2,7);
	System.out.println(a1);
	System.out.println(a1.contains(3));
	a1.clear();
	System.out.println(a1);
	
	System.out.println(a1.isEmpty());
}
}
