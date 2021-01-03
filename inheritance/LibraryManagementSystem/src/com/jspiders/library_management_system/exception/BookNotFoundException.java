package com.jspiders.library_management_system.exception;

/**
 * 
 * @author shravikaReddy
 *
 *
 *Used when book is not available in library.
 */
public class BookNotFoundException  extends RuntimeException
{
	
@Override
public String toString()
{
	return "book is not available";
}
}
