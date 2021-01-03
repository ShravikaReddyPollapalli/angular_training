package defaultpackage;

public class MethodOverloading {
public static int sum(int i,int j) {
	return i + j;
}
public static int sum(int i,int j,int k) {
	return i + j +k;
}
static int x;
public void display() {
	System.out.println(x);
}
public static float sum(float i,float j) {
	x = 10;
	return i + j;
}
public static void main(String[] args) {
	System.out.println(sum(1,1));
	System.out.println(sum(1,2,3));
	System.out.println(sum(1.2f,2.3f));
	MethodOverloading obj =  new MethodOverloading();
	obj.display();
}
}
