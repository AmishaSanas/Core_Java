package com.Collection.Comparator;

import java.util.Comparator;

public class CompareByRollNo implements Comparator<comparatorMarksheet>{

	@Override
	public int compare(comparatorMarksheet o1, comparatorMarksheet o2) {
		return o1.rollNo.compareTo(o2.rollNo);
			
	}

}