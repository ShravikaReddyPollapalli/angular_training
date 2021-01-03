package demo;
import java.util.*;
/**
 * 
 * @author shravikaReddy
 * 
 * Below class is implemented from Comparator
 *
 */
public class CompareBookId implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Book book1=(Book)o1;
		Book book2=(Book)o2;
		if(book1.getBookId()>book2.getBookId())
		{
			return 1;
			
		}
		else if(book1.getBookId()<book2.getBookId())
		{
			return -1;
		
		}
		else
		{
			return 0;
		}
		
	}

}
