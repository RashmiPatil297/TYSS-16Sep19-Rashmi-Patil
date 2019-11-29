package com.testyantra.immutable;

public class MyStringImmutable {
	
	private int rollno;
	private String name;
	
	public MyStringImmutable(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public MyStringImmutable changeContent(int rollno,String name) {
		MyStringImmutable m = new MyStringImmutable(rollno, name);
		return m;
	}
}
