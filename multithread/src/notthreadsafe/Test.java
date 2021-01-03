package notthreadsafe;

public class Test   {
public static void main(String[] args) {
	CommonResource cr=new CommonResource();
	Resource1 r1=new Resource1(cr);
	Resource2 r2=new Resource2(cr);
	r1.start();
	r2.start();
	
	
}
}
