package com.testyantra.predicate;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		
		Predicate<Teacher> p = s -> {
			if(s.salary >= 10000) {
				return true;
			}else {
				return false;
			}
		};
			
		
		Teacher s1 = new Teacher(1,"anup",10000);
		boolean res = p.test(s1);
		System.out.println("res = "+res);
	

	}

}
