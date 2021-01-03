package defaultpackage;

import java.util.Scanner;

public class ExceptionTest {
	
	    public static void main (String[] args)
	    {
	        try
	        {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter the 1st number:");
	            int number1 = sc.nextInt();
	            System.out.print("Enter the 2nd number:");
	            int number2 = sc.nextInt();
	            int result = number1 / number2;
	            System.out.println("The value of division is = "+ result);
	        }
	        catch (ArithmeticException e)
	        {
	            System.out.println("Division with 0 is not possible");
	        }
	        catch (NullPointerException e)
	        {
	            System.out.println("No Input Received");
	        }
	        catch (Exception e)
	        {
	            System.out.println("Only integers are allowed");

}
}}