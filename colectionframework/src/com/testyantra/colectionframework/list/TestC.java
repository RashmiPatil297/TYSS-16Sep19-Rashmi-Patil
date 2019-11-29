package com.testyantra.colectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(23);
		a1.add(98.7);
		a1.add(true);
		a1.add("good evening");
		
		Iterator it = a1.iterator();
		Object o1 =it.next();
		System.out.println("obj1 "+o1);
		
		Object o2 = it.next();
		System.out.println("obj2 "+o2);
		
		Object o3 = it.next();
		System.out.println("obj3 "+o3);
		
		boolean b = it.hasNext();
		System.out.println("has next "+b);
		
		/*
		 * Object o5 = it.next(); System.out.println("obj5 "+o5);
		 */
		
		
		
		
		
		for (int i = 0; i < a1.size(); i++) {
			
			Object o = a1.get(i);
			System.out.println(o);
			
		}
		
		ArrayList a2 = new ArrayList();
		a2.add(12);
		a2.add(233.34);
		a2.add("momo");
		a2.add(false);
		System.out.println("*********************using iterator***********************");
		Iterator it1 = a2.iterator();
		while(it.hasNext()) {
			Object o9 = it.next();
			System.out.println(o9);
		}
	}

}
