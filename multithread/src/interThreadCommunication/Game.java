package interThreadCommunication;

public class Game
{
public static void main(String[] args) 
{
	FootBall fb=new FootBall();
	Player1 p1=new Player1(fb);
	Player2 p2=new Player2(fb);
p1.start();
p2.start();
}
}

