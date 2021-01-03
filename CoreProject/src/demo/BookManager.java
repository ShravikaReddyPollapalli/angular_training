
package demo;


public class BookManager
//helper class
{
public static BookOperations getbookOperations()
//helper method
{
	BookOperations bookOperations=new BookOperationsImpl();
	//implementation class is upcasted to interface
	return bookOperations;
	//return the object in the form of interface
}
}
