package com.testyantra.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestTeacher {

	public static void main(String[] args) {
		
ArrayList<Teacher> a1 = new ArrayList<Teacher>();
		
		Teacher s1 = new Teacher("yash","J2ee" ,60000.0);
		Teacher s2 = new Teacher("punit","java" ,70000.4);
		Teacher s3 = new Teacher("darshan","sql", 80000.4);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		for (int i = 0; i < a1.size(); i++) {
			
			Teacher s = a1.get(i);
			System.out.println(s);
		}
		
		System.out.println("=============for-each =================");
		for(Teacher e : a1) {
			System.out.println(e);
		}
		
		System.out.println("============using iterator=============");
		Iterator< Teacher > e = a1.iterator();
		while(e.hasNext()) {
			Teacher e1 = e.next();
			System.out.println(e1);
		}
		
		System.out.println("============using list iterator");
		ListIterator<Teacher> l = a1.listIterator();
		while(l.hasNext()) {
			Teacher s = l.next();
			System.out.println(s);
		}
		


	}

}
