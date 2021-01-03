package com.jspiders.jdbcpro;
import java.util.*;
public class MainClass {
public static void main(String[] args) {
	Operations operations=Helper.getOperations();
	Scanner scanner=new Scanner(System.in);
	int continueOrStop=0;
	do {
		System.out.println("enter 1 to add the book");
		System.out.println("enter 2 search book by title");
		System.out.println("enter 3 to update the book price based on id");
		System.out.println("enter 4 to remove book based on id");
		System.out.println("enter 5 to get all the book details");
		System.out.println("enter your choice");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			operations.addBook();
		}
		else if(choice==2)
		{
			operations.searchByTitle();
		}
		else if(choice==3)
		{
			operations.updatePrice();
		}
		else if(choice==4)
		{
			operations.removeById();
		}
		else if(choice==5)
		{
			operations.getAllBooks();
		}else {
			System.err.println("invalid choice");
			System.out.println("enter 1 to continue/ 0 to stop");
			continueOrStop=scanner.nextInt();
			
		}
		}
	while(continueOrStop==1);
	
}
}