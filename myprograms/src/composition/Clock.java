package composition;

public class Clock {
public int hr;
 public int min;
public int sec;
public Clock(int hr, int min, int sec) {
	super();
	this.hr = hr;
	this.min = min;
	this.sec = sec;
}
public void time() {
	System.out.println("["+this.hr+":"+this.min+":"+this.sec+"]");
}
}
