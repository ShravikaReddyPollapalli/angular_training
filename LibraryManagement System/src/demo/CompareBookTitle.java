package demo;
import java.util.*;
/**
 * 
 * @author shravika
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
