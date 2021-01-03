package multithread;

public class Test {
public static void main(String[] args) {
		Demo d1=new Demo();
		Sample s1=new Sample();
		d1.start();
		s1.start();
}
}
