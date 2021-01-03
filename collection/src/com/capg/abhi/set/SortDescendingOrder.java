	package com.capg.abhi.set;

import java.util.Comparator;

public class SortDescendingOrder  implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
//		return o1.compareTo(o2) * -1;
		return o2.compareTo(o1);
	}

}
