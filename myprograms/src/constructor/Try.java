package constructor;

public class Try {
public int i;
public Try(int i) {
	this.i=i;
}
public void succeed() {
	System.out.println(i);
}
public static void main(String[] args) {
	Try t = new Try(5);
			t.succeed();
}
}
