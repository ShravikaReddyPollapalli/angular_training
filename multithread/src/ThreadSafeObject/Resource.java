package ThreadSafeObject;

public class Resource extends Thread
{
CommonResource1 cr;
public Resource(CommonResource1 cr)
{
	this.cr = cr;
}
public void run()
{
	cr.swim();
}
}
