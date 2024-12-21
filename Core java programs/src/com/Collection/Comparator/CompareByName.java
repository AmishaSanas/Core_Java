package com.Collection.Comparator;

import java.util.Comparator;

public class CompareByName implements Comparator<comparatorMarksheet>{

	@Override
	public int compare(comparatorMarksheet o1, comparatorMarksheet o2) {
		
		return  o1.name.compareTo(o2.name);
	}

}
