package MultiThreadType2;

public class Test {
public static void main(String[] args) {
	Sample s1=new Sample();
	Demo d1=new Demo();
	Thread t1=new Thread(s1);
	Thread t2=new Thread(d1);
	t1.start();
	t2.start();
}
}
