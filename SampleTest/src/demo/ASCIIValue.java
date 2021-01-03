package demo;

import java.util.Scanner;
public class ASCIIValue 
{
   public static void main(String args[])
   {
      System.out.println("Enter a character ::");
      Scanner scanner = new Scanner(System.in);
      char ch = scanner.next().charAt(0);
      int a = ch;
      System.out.println("ASCII value of the given character is ::"+a);
   }
}
