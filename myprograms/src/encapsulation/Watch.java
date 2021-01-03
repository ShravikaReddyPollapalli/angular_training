package encapsulation;

public class Watch {

private int hr;
private int min;
private int sec;
public Watch(int hr, int min, int sec) {
	super();
	this.hr = hr;
	this.min = min;
	this.sec = sec;
}
public void time() {
	System.out.println("["+this.hr+":"+this.min+":"+this.sec+"]");
}
public void changeTime(int hr, int min, int sec) {
	if((hr>=0&&hr<=23)&&(min>=0&&min<=59)&&(sec>=0&&sec<=59)) {
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	else {
		System.out.println("invalid");
	}
}

}
