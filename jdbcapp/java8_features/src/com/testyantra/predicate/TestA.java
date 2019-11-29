package com.testyantra.predicate;

import java.util.function.Predicate;

import com.testyantra.java8_features.Student;

public class TestA {

	public static void main(String[] args) {
		
		Predicate<Employee> p = s -> {
			if(s.id == 1) {
				return true;
			}else {
				return false;
			}
		};
			
		
		Employee s1 = new Employee(1,"anup",25.6);
		boolean res = p.test(s1);
		System.out.println("res = "+res);
	

	}

}
