package com.testyantra.stringbufferclass;

public class stringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("rashmi");
		System.out.println(s1);
		StringBuffer s2 = s1.append(" patil");
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s2);

	}

}
