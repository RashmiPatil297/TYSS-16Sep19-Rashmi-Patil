package com.testyantra.objectclass;

public class TestE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(10,"BMW","red");
		int studHashValue = c.hashCode();
		System.out.println(studHashValue);
		System.out.println(c);

	}

}
