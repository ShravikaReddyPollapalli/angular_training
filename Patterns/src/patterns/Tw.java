package patterns;

public class Tw {
public static void main(String[] args) {
	int star=6;
	for(int i=1;i<=9;i++)
	{
		if(i<=5)
		{
			star--;
		}
		else
		{
			star++;
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
