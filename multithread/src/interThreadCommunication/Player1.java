package interThreadCommunication;

public class Player1 extends Thread
{
	FootBall fb;
	public Player1(FootBall fb)
	{
		this.fb=fb;
	}
public void run()
{
	fb.kick();
}
}
