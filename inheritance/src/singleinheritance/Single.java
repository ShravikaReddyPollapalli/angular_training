package singleinheritance;

public class Single {
	public static void main(String[] args) {
		A a1=new A(5);
		System.out.println(a1.i);
		B b1=new B(2,3);
		System.out.println(b1.i);
		System.out.println(b1.j);
		}

}
