package pack;

public class Circle {
public static double pi=3.14;;
public int r;
public double area;

public Circle(int r) {
	super();
	this.r = r;
	
}
public void getArea()
{
	this.area=this.pi*this.r*this.r;
	System.out.println(this.area);
}
}
