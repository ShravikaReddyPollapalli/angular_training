package interThreadCommunication;

public class Player2 extends Thread{
	FootBall fb;
	public Player2(FootBall fb)
	{
		this.fb=fb;
	}
public void run()
{
	fb.pass();
}
}
