package com.testyantra.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class TestEmployee {

	public static void main(String[] args) {
		
ArrayList<Employee> a1 = new ArrayList<Employee>();
		
		Employee s1 = new Employee(101, "yash", 60000.0);
		Employee s2 = new Employee(102, "punit", 70000.4);
		Employee s3 = new Employee(103, "darshan", 80000.4);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		for (int i = 0; i < a1.size(); i++) {
			
			Employee s = a1.get(i);
			System.out.println(s);
		}
		
		System.out.println("=============for-each =================");
		for(Employee e : a1) {
			System.out.println(e);
		}
		
		System.out.println("============using iterator=============");
		Iterator< Employee > e = a1.iterator();
		while(e.hasNext()) {
			Employee e1 = e.next();
			System.out.println(e1);
		}
		
		System.out.println("============using list iterator");
		ListIterator<Employee> l = a1.listIterator();
		while(l.hasNext()) {
			Employee s = l.next();
			System.out.println(s);
		}
		
	}



	}


