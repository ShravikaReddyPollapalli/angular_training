package com.jspiders.library_management_system.dao;
//interface
import java.util.ArrayList;

import com.jspiders.library_management_system.dto.Book;
import com.jspiders.library_management_system.exception.BookNotFoundException;

public interface BookOperations
{
	//create interface methods
	/**
	 * Using this functionality we can add a new book in the library.
	 * 
	 * @param book
	 */
void addBook(Book book);

/**
 * Using this functionality we can search a  book based on title in the library.
 * @throws BookNotFoundException
 * @param bookTitle
 * @return ArrayList<Book>
 */
ArrayList<Book> searchBookTitle(String bookTitle);

/**
 *  Using this functionality we can search a book based on author in the library.
 * @param bookAuthor
 * @return ArrayList<Book>
 */
ArrayList<Book> searchBookAuthor(String bookAuthor);



/**
 * Using this functionality we can search a book based on book type .
 * @param bookType
 * @return ArrayList<Book>
 */


ArrayList<Book> searchBookType(String bookType);
/**
 * Using this functionality we can update the book price.
 * @param bookId
 * @param bookPrice
 */


void updateBookPrice(int bookId,double bookPrice);
/**
 * Using this functionality we can remove a book based on the id.
 * @param bookId
 * @return boolean
 */

boolean removeId(int bookId);
/**
 * Using this functionality we can get all the bookIds in the library.
 * @return ArrayList<Integer>
 */
ArrayList<Integer> getIds();
/**
 * Using this functionality we can get the information of all the books.
 * @return ArrayList<Book>
 */
ArrayList<Book> getBookInfo();
/**
 * Using this functionality we can sort books based on the User choice.
 * @param ch
 */
void sortBooks(int ch);

}

