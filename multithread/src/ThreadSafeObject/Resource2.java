package ThreadSafeObject;

public class Resource2 extends Thread
{
CommonResource1 cr;

public Resource2(CommonResource1 cr) {
	this.cr = cr;
}
public void run()
{
	cr.fly();
}
}
