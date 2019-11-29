package com.testyantra.immutable;

public class TestString {

	public static void main(String[] args) {

		MyStringImmutable ms = new MyStringImmutable(12, "Rashmi");

		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms);

		MyStringImmutable m = new MyStringImmutable(10, "Rashii");

		System.out.println(m.getName());
		System.out.println(m.getRollNo());
		System.out.println(m);
		
		MyStringImmutable ms1 = m.changeContent(11, "Rash");
		System.out.println(ms1.getName());
		System.out.println(ms1.getRollNo());


	}

}
