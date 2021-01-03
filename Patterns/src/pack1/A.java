package pack1;

public class A {
public static void main(String[] args) {
	int star=-1;
	int space=5;
	
	for(int i=1;i<=9;i++)
	{
	if(i<=5)
	{
		space--;
		star++;
		}
	else
	{
		space++;
		star--;
		}
	if(i>5)
	{
		star--;
	}
	else
	{
		star++;
	}
	
	for(int j=1;j<=space;j++)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=star;k++)
		
	{
		System.out.print("*");
	}

	
	System.out.println();
	}
}
}
