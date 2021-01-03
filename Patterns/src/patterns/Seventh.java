package patterns;

public class Seventh {
public static void main(String[] args) {
	int star=-1;
	for(int i=1;i<=7;i++)
	{
		star+=2;;
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
