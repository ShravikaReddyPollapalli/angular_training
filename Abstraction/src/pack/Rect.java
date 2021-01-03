package pack;

public class Rect {
public int l;
public int b;
public int area;
public Rect(int l, int b) {
	super();
	this.l = l;
	this.b = b;
}
public void getArea()
{
	this.area=this.l*this.b;
	System.out.println(this.area);
}
}
