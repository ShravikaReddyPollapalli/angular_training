package patterns;

public class Thirtheen {
public static void main(String[] args) {
	int space=4;
	int star=0;
	for(int i=1;i<=7;i++)
	{
		if(i<=4)
		{
			star++;
			space--;
		}
		else
		{
			star--;
			space++;
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
