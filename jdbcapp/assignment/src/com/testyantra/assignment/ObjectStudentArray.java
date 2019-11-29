package com.testyantra.assignment;

public class ObjectStudentArray {
	
	int id;
	String name;
	double percentage;
	public ObjectStudentArray(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "ObjectStudentArray [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	

}
