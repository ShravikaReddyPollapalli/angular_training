package com.jspiders.library_management_system.dao;
import java.util.ArrayList;
import java.util.Collections;

import com.jspiders.library_management_system.dto.Book;
import com.jspiders.library_management_system.exception.BookNotFoundException;
import com.jspiders.library_management_system.services.CompareBookAuthor;
import com.jspiders.library_management_system.services.CompareBookId;
import com.jspiders.library_management_system.services.CompareBookPrice;
import com.jspiders.library_management_system.services.CompareBookTitle;
import com.jspiders.library_management_system.services.CompareBookType;
//implementation class
/**
 * 
 * @author shravikaReddy
 * Below class is implementation class for @see BookOperations Interface.
 *
 */
public class BookOperationsImpl implements BookOperations
{
	//implementing the methods
	private static ArrayList<Book> booklist=new ArrayList<Book>();
	
	@Override
	public void addBook(Book book)
	{
		booklist.add(book);
	}

	@Override
	public ArrayList<Book> searchBookTitle(String bookTitle)
	{
		ArrayList<Book> searchlist=new ArrayList<Book>();
		for(int i=0;i<=booklist.size()-1;i++)
		{
			Book retrievedbooklist=booklist.get(i);
			String retrievedBookTitle=retrievedbooklist.getBookTitle();
			if(retrievedBookTitle.equals(bookTitle))
			{
				searchlist.add(retrievedbooklist);
			}
		}
		if(searchlist.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchlist;
		}
		
	}

	@Override
	public ArrayList<Book> searchBookAuthor(String bookAuthor)
	{
		ArrayList<Book> searchlist=new ArrayList<Book>();
		for(int i=0;i<=booklist.size()-1;i++)
		{
			Book retrievedbooklist=booklist.get(i);
			String retrievedBookAuthor=retrievedbooklist.getBookAuthor();
			if(retrievedBookAuthor.equals(bookAuthor))
			{
				searchlist.add(retrievedbooklist);
			}
		}
		if(searchlist.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchlist;
		}
		
	}

	@Override
	public ArrayList<Book> searchBookType(String bookType) {
		ArrayList<Book> searchlist=new ArrayList<Book>();
		for(int i=0;i<=booklist.size()-1;i++)
		{
			Book retrievedbooklist=booklist.get(i);
			String retrievedBookType=retrievedbooklist.getBookType();
			if(retrievedBookType.equals(bookType))
			{
				searchlist.add(retrievedbooklist);
			}
		}
		if(searchlist.size()==0)
		{
			throw new BookNotFoundException();
		}
		else
		{
			return searchlist;
		}
		
		
	}

	@Override
	public void updateBookPrice(int bookId, double bookPrice)
	{
		for(int i=0;i<=booklist.size()-1;i++)
		{
			int status=0;
			Book retrievedBook=booklist.get(i);
			int retrievedId=retrievedBook.getBookId();
			if(bookId==retrievedId)
			{
				System.out.println("before update"+retrievedBook);
				status=1;
				retrievedBook.setBookPrice(bookPrice);
				booklist.set(i, retrievedBook);
				System.out.println("after update"+retrievedBook);
				break;
			}
		
		    if(status==0)
		    {
			throw new BookNotFoundException();
			}
		    }
		
	     }

	@Override
	public boolean removeId(int bookId) 
	{
		boolean status=false;
		for(int i=0;i<=booklist.size()-1;i++)
		{
		Book retrievedBook=booklist.get(i);
		int retrievedId=retrievedBook.getBookId();
		if(retrievedId==bookId)
		{
		status=true;
		booklist.remove(i);
		break;
		}
		}
		return status;
		}
	
		
	

	@Override
	public ArrayList<Integer> getIds()
	{
		ArrayList<Integer> idlist=new ArrayList<Integer>();
		for(int i=0;i<=booklist.size()-1;i++)
		{
			Book retrievedBook=booklist.get(i);
			int retrievedBookId=retrievedBook.getBookId();
			idlist.add(retrievedBookId);
		}
		return idlist;
	}

	@Override
	public ArrayList<Book> getBookInfo() 
	{
		
		return booklist;
				
	}

//	@Override
//	public void sortBooks()
//	{
//		Collections.sort(booklist);
//		
//		
//	}
	@Override
	public void sortBooks(int ch)
	{
		if(ch==1)
		{
			CompareBookId cbi=new CompareBookId();
			Collections.sort(booklist,cbi);
			System.out.println("sorted books based on ids");
		}
		if(ch==2)
		{
			CompareBookPrice cbp=new CompareBookPrice();
			Collections.sort(booklist,cbp);
			System.out.println("sorted books based on price");
		}
		if(ch==3)
		{
			CompareBookTitle cbt=new CompareBookTitle();
			Collections.sort(booklist,cbt);
			System.out.println("sorted books based on title");
		}
		
		if(ch==4)
		{
			CompareBookAuthor cba=new CompareBookAuthor();
			Collections.sort(booklist,cba);
			System.out.println("sorted books based on author");
		}
		if(ch==5)
		{
			CompareBookType cbtype=new CompareBookType();
			Collections.sort(booklist,cbtype);
			System.out.println("sorted books based on type");
		}
	}

}
