package demo;
/**
 * 
 * @author shravikaReddy
 *
 *
 *Below class is JAVA BEAN CLASS
 */
public class Book
//implements Comparable
{
	//encapsulation
private int bookId;
private String bookTitle;
private String bookAuthor;
private String bookType;
private double bookPrice;
public Book(int bookId, String bookTitle, String bookAuthor, String bookType, double bookPrice) {
	super();
	this.bookId = bookId;
	this.bookTitle = bookTitle;
	this.bookAuthor = bookAuthor;
	this.bookType = bookType;
	this.bookPrice = bookPrice;
}
//getter and setter methods
/**
 * This method is used to get BookTitle.
 * @return String
 */
public String getBookTitle() {
	return this.bookTitle;
}
/**
 * This method is used to set the  BookTitle.
 * @param bookTitle
 */
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}

/**
 * This method is used to get Author of the Book.
 * @return String
 */
public String getBookAuthor() {
	return this.bookAuthor;
}

/**
 * This method is used to set Author of the Book.
 * @return bookAuthor
 */
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}

/**
 * This method is used to get the type of the Book.
 * @return String
 */
public String getBookType() {
	return this.bookType;
}

/**
 * This method is used to set the type of the book.
 * @param bookType
 */
public void setBookType(String bookType) {
	this.bookType = bookType;
}

/**
 * This method is used to get the BookPrice
 * @return double
 */
public double getBookPrice() {
	return this.bookPrice;
}

/**
 * This method is used to set the BookPrice
 * @param bookPrice
 */
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}
/**
 * This method is used to get all the book Ids.
 * @return int
 */
public int getBookId() {
	return this.bookId;
}

/**
 * The toString method is overrided .
 * this method returns the useful information.
 */
@Override 
public String toString() {
	return "Bookinfo---> [bookId=" + this.bookId + ", bookTitle=" + this.bookTitle + ", bookAuthor=" + this.bookAuthor + ", bookType="
			+ this.bookType + ", bookPrice=" + this.bookPrice + "]";
}

/**
 * 
 * equals method  is overrided  from Object class
 * Used to compare two string objects.
 * @returns boolean
 */
@Override
public boolean equals(Object object)
{
	Book book=(Book)object;
return this.bookId==bookId;
}

/**
 * hashCode method is overrided from object class.
 * returns int
 */
@Override
public int hashCode()
{
	return this.bookId;
}

}