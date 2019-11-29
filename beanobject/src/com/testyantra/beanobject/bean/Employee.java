package com.testyantra.beanobject.bean;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String deptName;
	private String designation;
	
Employee() {
		
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	
	public String getDesignation() {
		return designation;
	}


	
	}
