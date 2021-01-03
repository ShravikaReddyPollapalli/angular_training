package pack2;

public class Array {
public static void main(String[] args) {
	int[] a1=new int[3];
	a1[0]=72;
	a1[1]=34;
	a1[2]=56;
	for(int i=0;i<=a1.length-1;i++)
	{
		System.out.println(a1[i]);
	}
	//
	int[] a= {3,4,5};
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	//
	int[] a2=new int[] {1,2,3};
	for(int i=0;i<=a2.length-1;i++)
	{
		System.out.println(a2[i]);
	}
	//
	double[] d=new double[3];
	d[0]=0;
	d[1]=1;
	d[2]=2;
	for(int i=0;i<=d.length-1;i++)
	{
		System.out.println(d[i]);
	}
	//
	double[] d1= {1.2,2.3,3.4};
	for(int i=0;i<=d1.length-1;i++)
	{
		System.out.println(d1[i]);
	}
	//
	char[] c=new char[3];
	c[0]='f';
	c[1]='s';
	c[2]='e';
	for(int i=0;i<=c.length-1;i++)
	{
		System.out.println(c[i]);
	}
	//
	char[] c1= {'a','s','s'};
	for(int i=0;i<=c1.length-1;i++)
	{
		System.out.println(c1[i]);
	}
	
}
}
