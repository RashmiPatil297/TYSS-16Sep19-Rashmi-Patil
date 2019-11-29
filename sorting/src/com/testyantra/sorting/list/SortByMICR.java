package com.testyantra.sorting.list;

import java.util.Comparator;

public class SortByMICR implements Comparator<Bank>{
	
	@Override
	public int compare(Bank o1, Bank o2) {
		
		Long i1 = o1.micr;
		Long i2 = o2.micr;
		return i1.compareTo(i2);
	}

}
