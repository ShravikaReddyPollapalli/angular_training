package composition;

public class ClockTower {
public Clock c;
public String loc;
public ClockTower(Clock c, String loc) {
	super();
	this.c = c;
	this.loc = loc;
}
public void displayTime() {
	c.time();
}
}
