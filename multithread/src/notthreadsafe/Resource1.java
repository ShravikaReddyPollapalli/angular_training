package notthreadsafe;

public class Resource1 extends Thread {
CommonResource cr;
public Resource1(CommonResource cr)
{
	this.cr=cr;
}
public void run()
{
	cr.swim();
}
}
