package multithread;

public class Sample extends Thread {

public void shra()
{
	System.out.println("shravika");
}
public void run()
{
	this.shra();
	
}
}
