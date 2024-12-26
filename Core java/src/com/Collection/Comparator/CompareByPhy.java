package com.Collection.Comparator;

import java.util.Comparator;

public class CompareByPhy implements Comparator<comparatorMarksheet> {

	@Override
	public int compare(comparatorMarksheet o1, comparatorMarksheet o2) {
		return o1.phy - o2.phy;
	
	}

}
