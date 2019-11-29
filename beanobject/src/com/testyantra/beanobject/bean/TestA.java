package com.testyantra.beanobject.bean;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student s = new Student();
      s.setId(12);
      s.setName("Basava");
      s.setRollno(12);
      
      Employee e = new Employee();
      s.setId(1);
      e.setName("vishwa");
      e.setSalary(30000);
      e.setDesignation("Engineer");
      e.setDeptName("CIVIIL");
      
      
      Database d = new Database();
      d.receive(s);
      d.save(e);
      
 
     
	}

}
