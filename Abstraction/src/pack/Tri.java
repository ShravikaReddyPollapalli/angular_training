package pack;

public class Tri {
	
public int b;
public int h;
public double area;
public Tri(int b,int h) {
	super();
	this.b=b;
	this.h=h;
}
public void getArea()
{
	this.area=0.5*this.b*this.h;
	System.out.println(this.area);
}

}
