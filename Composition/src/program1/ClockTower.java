package program1;

public class ClockTower {
Clock c;
String loc;
public ClockTower(Clock c, String loc) {
	super();
	this.c = c;
	this.loc = loc;
}
public void displayTime()
{
	c.time();
	System.out.println("in "+this.loc);
}

}
