package pack2;

public class Load {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	protected void add(int a,double b,double c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		Load s1=new Load();
		s1.add(2,3);
		Load.add(3, 4.5);
		s1.add(2, 3,4);
		s1.add(4, 3,2);
	}
}
