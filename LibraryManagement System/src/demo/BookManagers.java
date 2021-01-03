package demo;

/**
 * 
 * @author shravika
 *
 *
 *Below class is a Helper class for @see BookOperations Interface
 */
public class BookManagers
//helper class
{
	/**
	 * Helper method : create BookOperations implementation class object 
	 *              and upcasted to BookOperations and returns object of interface
	 * @return BookOperations
	 */
public static BookOperations getbookOperations()
//helper method
{
	BookOperations bookOperations=new BookOperationsImpl();
	//implementation class is upcasted to interface
	return bookOperations;
	//return the object in the form of interface
}
}
