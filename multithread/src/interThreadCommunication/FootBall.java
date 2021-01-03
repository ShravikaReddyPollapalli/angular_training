package interThreadCommunication;

public class FootBall extends Thread 
{
synchronized  void kick()
{
	try
	{
		wait();
		System.out.println("kick...");
	}
	catch(InterruptedException rv)
	{
		
	}
}
synchronized  void pass()
{
System.out.println("pass the ball");
notify();
}
}
