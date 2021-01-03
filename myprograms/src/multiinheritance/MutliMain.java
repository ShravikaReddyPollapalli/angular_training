package multiinheritance;

public class MutliMain {
public static void main(String[] args) {
	 C c = new C(1,2,3);
	 System.out.println(c.i);
	 System.out.println(c.j);
	 System.out.println(c.k);
	 B b = new B(18,4);
	 System.out.println(b.i);
	 System.out.println(b.j);
}
}
