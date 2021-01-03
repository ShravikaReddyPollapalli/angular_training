package pack2;

public class T {
public static int as(int number) {
	int num=number;
	int i;
	if(number<0) {
		return -1;
	}
	for(  i=2;i<=num;i++)
	{
		if(num%i==0) {
			num=num/i;
			i--;
		}}
		return i;
	}
public static void main(String[] args) {
	System.out.println(as(21));
}
}

