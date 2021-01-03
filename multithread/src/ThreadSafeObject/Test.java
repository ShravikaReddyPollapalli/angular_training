package ThreadSafeObject;

public class Test 
{
public static void main(String[] args)
{
	CommonResource1 cr=new CommonResource1();
	Resource r1=new Resource(cr);
	Resource2 r2=new Resource2(cr);
	r1.start();
	r2.start();
	
}
}
