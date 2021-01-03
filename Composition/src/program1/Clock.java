package program1;

public class Clock {
public int hour;
public int min;
public int sec;
public Clock(int hour, int min, int sec) {
	super();
	this.hour = hour;
	this.min = min;
	this.sec = sec;
}
public void time()
{
	System.out.println("Time is["+this.hour+":"+this.min+":"+this.sec+"]");
}
}
