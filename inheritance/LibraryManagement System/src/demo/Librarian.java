package demo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Librarian extends Thread
{
Scanner scan=new Scanner(System.in);
/**
 * using this method we perform various Book Operations
 * such as:Refer below Document.
 * @see BookOperations
 */
public void performOperations()
{
	
	BookOperations bookOperations=BookManagers.getbookOperations();
	System.out.println("press 1 to add a book");
	System.out.println("press 2 to search the book based on the title");
	System.out.println("press 3 to search the book based on the author");
	System.out.println("press 4 to search the book based on the type");
	System.out.println("press 5 to update the book based on the price");
	System.out.println("press 6 to remove books");
	System.out.println("press 7 to get all the book ids");
	System.out.println("press 8 to display all the book information");
	System.out.println("press 9 to sort all the books");
	System.out.println("enter your choice");
	int choice=scan.nextInt();
	if(choice==1)
	{
		System.out.println("enter the id of the book");
		int bookId=scan.nextInt();
		System.out.println("enter the title of the book");
		String bookTitle=scan.next();
		System.out.println("enter the author of the book");
		String bookAuthor=scan.next();
		System.out.println("enter the type of the book");
		String bookType=scan.next();
		System.out.println("enter the price of the book");
		double bookPrice=scan.nextDouble();
		Book book=new Book(bookId,bookTitle,bookAuthor,bookType,bookPrice);
		bookOperations.addBook(book);
		}
	else if(choice==2)
	{
		System.out.println("enter book title to search");
		String bookTitle=scan.next();
		try
		{
		ArrayList<Book> searchlist=bookOperations.searchBookTitle(bookTitle);
		Iterator<Book> iteratorsearchlist=searchlist.iterator();
	    while(iteratorsearchlist.hasNext())
		{
		Book searchedBook=iteratorsearchlist.next();
		System.out.println(searchedBook);
		}
	    }
		catch(BookNotFoundException  exp)
		{
			System.out.println(exp);
		}
    }
	else if(choice==3)
	{
		System.out.println("enter book Author to search");
		String bookAuthor=scan.next();
		try
		{
		ArrayList<Book> searchlist=bookOperations.searchBookAuthor(bookAuthor);
		Iterator<Book> iteratorsearchlist=searchlist.iterator();
	    while(iteratorsearchlist.hasNext())
		{
		Book searchedBook=iteratorsearchlist.next();
		System.out.println(searchedBook);
		}
	    }
		catch(BookNotFoundException  exp)
		{
			System.out.println(exp);
		}
	}
	else if(choice==4)
	{
		System.out.println("enter book Type to search");
		String bookType=scan.next();
		try
		{
		ArrayList<Book> searchlist=bookOperations.searchBookType(bookType);
		Iterator<Book> iteratorsearchlist=searchlist.iterator();
	    while(iteratorsearchlist.hasNext())
		{
		Book searchedBook=iteratorsearchlist.next();
		System.out.println(searchedBook);
		}
	    }
		catch(BookNotFoundException  exp)
		{
			System.out.println(exp);
		}
	}
	else if(choice==5)
	{
		System.out.println("enter book id");
		int bookId=scan.nextInt();
		System.out.println("enter updated book price");
		double bookPrice=scan.nextDouble();
		try
		{
			bookOperations.updateBookPrice(bookId,bookPrice);
			
		}
		catch(BookNotFoundException exp)
		{
			System.out.println(exp+"so update is not possible");
		}
	}
	else if(choice==6)
	{
		System.out.println("enter book id");
		int bookId=scan.nextInt();
		boolean removalstatus=bookOperations.removeId(bookId);
		
			if(removalstatus)
			{
				System.out.println("book is succesfully removed from the library");
			}
			else
			{
				System.out.println("book is not found");
			}
		}
	
	else if(choice==7)
	{
		ArrayList<Integer> idlist=bookOperations.getIds();
		for(int i=0;i<=idlist.size()-1;i++)
		{
			System.out.println(idlist.get(i));
		}
	}
	
    
	
   else if(choice==8) 
	  {
		  ArrayList<Book> alllist=bookOperations.getBookInfo();
		  for(int i=0;i<=alllist.size()-1;i++) 
		  {
	        System.out.println(alllist.get(i));
	      } 
      }
  

	  else if(choice==9)
	  {
		  System.out.println("press 1 to sort the books based on id");
		  System.out.println("press 2 to sort the books based on price");
		  System.out.println("press 3 to sort the books based on title");
		  System.out.println("press 4 to sort the books based on author");
		  System.out.println("press 5 to sort the books based on type");
		
		   int ch=scan.nextInt();
		   bookOperations.sortBooks(ch);
	  }

	  else
	  {
		  System.out.println("invalid choice");
	  }
}

/**
 * Using this method,User will decide to continue or stop Book Operations.
 */
	  public void continueOrStop()
	  {
		System.out.println("welcome to library");
	      int continueOrStopStatus=0; 
	    do 
	    {
	      performOperations(); 
	      System.out.println("press 1 to continue");
	      System.out.println("press 0 to stop");
	      continueOrStopStatus=scan.nextInt();
	    }while(continueOrStopStatus==1);
	  System.out.println("Thanku visit us again");
	     }
	 
	  /**
	   * This method will execute all operations of library in separate thread.
	   */
	@Override
		public void run()
		{
		//System.out.println("welcome to library");
		continueOrStop();
		
		//System.out.println("Thanku visit us again");
		}
}
