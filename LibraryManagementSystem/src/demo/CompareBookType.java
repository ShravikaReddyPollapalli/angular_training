package demo;
import java.util.*;
/**
 * 
 * @author shravikaReddy
 * 
 * Below class is implemented from Comparator
 *
 */
public class CompareBookType implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Book book1=(Book)o1;
		Book book2=(Book)o2;
		String Type1=book1.getBookType();
		String Type2=book2.getBookType();
		int res=Type1.compareTo(Type2);
		return res;
	}

}
