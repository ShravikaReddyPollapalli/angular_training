package pack2;

public class Load1 extends Load {
	public static void main(String[] args)
	{
		Load s1=new Load();
		s1.add(2,3);
		Load.add(3, 4.5);
		s1.add(2, 3,4);
		s1.add(4, 3,2);
	}
}
