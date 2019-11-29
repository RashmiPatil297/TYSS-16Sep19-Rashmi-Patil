package com.testyantra.java8_features;

import java.util.ArrayList;

public class TestS {

		public static void main(String[] args) {
			
			ArrayList<Student> al = new ArrayList<Student>();
			al.add(new Student(5,"vikram",56.9));
			al.add(new Student(3,"yash",67.9));
			al.add(new Student(6,"vijay",50.9));
			al.add(new Student(2,"akshay",65.9));
			al.add(new Student(1,"aishu",90.9));
			
			Helper h = new Helper();
		//	h.displayAllStudent(al);
		//	h.displayFailedstudents(al);
			h.displayTopper(al);
		}
}
