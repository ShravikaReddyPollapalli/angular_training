package patterns;

public class Fifteen {
public static void main(String[] args) {
	int space=8;
	int star=0;
	for(int i=1;i<=7;i++)
	{
		if(i<=4)
		{
			space=8;
			star++;
		}
		else
		{
			space=8;
			star--;
		}
		for(int j=1;j<=space;j++)
		{
			if((i==3)||(i==4)||(i==5))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
	
}
