package demo;
import java.util.*;
/**
 * 
 * @author shravikaReddy
 * 
 * below class is implemented from comparator.
 *
 */
public class CompareBookAuthor implements Comparator {

	@Override
	public int compare(Object o1, Object o2)
	{
		Book book1=(Book)o1;
		Book book2=(Book)o2;
		String author1=book1.getBookAuthor();
		String author2=book2.getBookAuthor();
		int res=author1.compareTo(author2);
		return res;
	}

}
