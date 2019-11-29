package com.testyantra.assignment;

public class Teacher {
	
	
	String name;
	String subject;
	double salary;
	public Teacher(String name, String subject, double salary) {
		super();
		this.name = name;
		this.subject = subject;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	

}
