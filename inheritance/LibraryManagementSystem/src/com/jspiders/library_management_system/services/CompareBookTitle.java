package com.jspiders.library_management_system.services;
import java.util.Comparator;

import com.jspiders.library_management_system.dto.Book;
/**
 * 
 * @author shravikaReddy
 * 
 * Below class is implemented from Comparator
 *
 */
public class CompareBookTitle implements Comparator {
	@Override
	public int compare(Object o1, Object o2)
	{
		Book book1=(Book)o1;
		Book book2=(Book)o2;
		String Title1=book1.getBookTitle();
		String Title2=book2.getBookTitle();
		int res=Title1.compareTo(Title2);
		return res;
	}
}
