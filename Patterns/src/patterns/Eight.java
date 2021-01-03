package patterns;

public class Eight {
public static void main(String[] args) {
	int star=0;
	int space=4;
	for(int i=1;i<=4;i++)
	{
		star++;
		space--;
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
