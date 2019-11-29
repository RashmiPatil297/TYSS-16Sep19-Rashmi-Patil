package com.testyantra.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	
	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		SortByMICR sb1 = new SortByMICR();
		SortByPincode sb2 = new SortByPincode();
		TreeSet<Bank> ts = new TreeSet<Bank>(sb2);
		Bank b1 = new Bank("HDFC",560068,6768689);
		Bank b2 = new Bank("SBI",560071,6867678);
		Bank b3 = new Bank("UBI",560054,6568335);
		Bank b4 = new Bank("CANARA",560076,6463689);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("**************using iterator***************");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println("===========================");
		}
		
		
		
	}

}
