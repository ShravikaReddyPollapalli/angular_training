package overloading;

public class Addition {
public void add(int a,int b) {
	System.out.println(a+b);
}
public void add(int a, double b) {
	System.out.println(a+b);
}
public double add(int a,double b,double c) {
	return a+b+c;
}
}
