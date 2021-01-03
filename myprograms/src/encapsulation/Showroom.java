package encapsulation;

public class Showroom {
public static void main(String[] args) {
	Watch watch = new Watch(00,78,89);
	watch.time();
	watch.changeTime(23,34,45);
	watch.time();
}
}
