package multithread;

public class Demo  extends Thread{

public void sam()
{
	System.out.println("gorgeous");
}
public void run()
{
	this.sam();
}
}
