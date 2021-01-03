package ThreadSafeObject;

public class CommonResource1  extends Thread{
synchronized void swim()
	{
		System.out.println("swimming");
	}
synchronized void fly()
	{
		System.out.println("flying");
	}
}
