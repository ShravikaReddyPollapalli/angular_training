package pack1;

public class CheckedException {
public static void main(String[] args)
{
	try {
		info();
	}
	catch(InterruptedException rv)
	{
		System.out.println("exception is caught");
	}
	System.out.println("hi");
}
	public static void info() throws InterruptedException
	{
		Thread.sleep(3000);
	}
}

