package patterns;

public class Tenth {
public static void main(String[] args) {
	int at=5;
	int star=-1;
	int quest=5;
	for(int i=1;i<=5;i++)
	{
		at--;
		star+=2;
		quest--;
		for(int j=1;j<=at;j++)
		{
			System.out.print("@");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		for(int l=1;l<=quest;l++)
		{
			System.out.print("?");
		}
		System.out.println();
		
	}
}
}
