package overloading;

public class MainClass {
public static void main(String[] args) {
	Addition addition = new Addition();
	addition.add(2, 3);
	addition.add(2, 2.5);
	System.out.println(addition.add(5, 5.3, 5.4));
}
}
