package composition;

public class Road {
public static void main(String[] args) {
	ClockTower ct = new ClockTower(new Clock(6,21,56),"hyd");
	ct.displayTime();
}
}
