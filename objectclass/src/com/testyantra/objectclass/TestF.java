package com.testyantra.objectclass;

public class TestF {

	public static void main(String[] args) {
		
		Cow c1 = new Cow(1,"ganga",10000);
		Cow c2 = new Cow(2,"Gowri",20000);
		Cow c3 = c1;
		boolean isEquals = c1.equals(c3);
		System.out.println(isEquals);
		
		boolean isEqual = c1.equals(c2);
		System.out.println(isEqual);


	}

}
