package notthreadsafe;

public class CommonResource  extends Thread{
public void swim()
{
	System.out.println("swimming");
}
public void fly()
{
	System.out.println("flying");
}
}
