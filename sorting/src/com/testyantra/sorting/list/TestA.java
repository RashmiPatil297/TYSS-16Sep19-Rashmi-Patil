package com.testyantra.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Student> a1 = new ArrayList<>();
		
		Student s1 = new Student(2, "dimple", 60.5);
		Student s2 = new Student(3, "Gimle", 30.5);
		Student s3 = new Student(1, "Tummy", 70.5);
		Student s4 = new Student(4, "jimmy", 50.5);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		
		displayStudentDetails(a1);
		Collections.sort(a1);
		System.out.println("after sorting ");
		displayStudentDetails(a1);
		
	}
	
	static void displayStudentDetails(ArrayList<Student> a1) {
		Iterator<Student> it = a1.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("----------------------------------");
		}
		
	}
}
