package patterns;

public class Eleventh {
public static void main(String[] args) {
	int star=0;
	for(int i=1;i<=7;i++)
	{
		if(i<=4)
		{
			star++;
		}
		else
		{
			star--;
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
