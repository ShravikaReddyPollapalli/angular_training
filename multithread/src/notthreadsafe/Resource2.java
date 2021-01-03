package notthreadsafe;

public class Resource2 extends Thread{
CommonResource cr;
public Resource2(CommonResource cr)
{
	this.cr=cr;
}
public void run()
{
	cr.fly();
}
}
