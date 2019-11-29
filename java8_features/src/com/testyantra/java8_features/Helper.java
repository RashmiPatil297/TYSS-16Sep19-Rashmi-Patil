package com.testyantra.java8_features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	


	void displayAllStudent(ArrayList<Student> al) {

		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
		}
	}
	void displayFailedstudents(ArrayList<Student> al1) {
		List<Student> l =
				al1.stream().filter(Student -> Student.percentage < 40).collect(Collectors.toList());
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			Student s1 = it.next();
			System.out.println("Id is "+s1.id);
			System.out.println("Name is "+s1.name);
			System.out.println("Percentage is "+s1.percentage);
		}
	}

	void displayTopper(ArrayList<Student> al) {

		Comparator<Student> cmp = (s1,s2)->{
			if(s1.percentage > s2.percentage) {
				return 1;
			}else if(s1.percentage < s2.percentage) {
				return -1;
			}else {
				return 0;
			}
		};

		Student s =
				al.stream().max(cmp).get();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
		}
	}



