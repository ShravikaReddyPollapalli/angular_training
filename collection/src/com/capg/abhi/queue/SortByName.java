package com.capg.abhi.queue;

import java.util.Comparator;

public class SortByName  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.studName.compareTo(o2.studName);
	}

	

}
