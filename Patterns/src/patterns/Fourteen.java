package patterns;

public class Fourteen {
public static void main(String[] args) {
	int ls=6;
	int ms=-2;
	int rs=6;
	for(int i=1;i<=9;i++)
	{
		if(i<=5)
		{
			ls--;
			ms+=2;
			rs--;
		}
		else
		{
			ls++;
			ms-=2;
			rs++;
		}
		for(int j=1;j<=ls;j++)
		{
			System.out.print("*");
		}
		for(int k=1;k<=ms;k++)
		{
			System.out.print(" ");
		}
		for(int l=1;l<=rs;l++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
