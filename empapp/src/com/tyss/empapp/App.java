package com.tyss.empapp;




import java.util.List;
import java.util.Scanner;

import com.tyss.empapp.dao.EmployeeDAO;
import com.tyss.empapp.dao.EmployeeDAOImpl;
import com.tyss.empapp.dto.EmployeeBean;
import com.tyss.empapp.util.EmployeeManager;

public class App {
  public static void main(String[] args) {
	  
	  

		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search employee data");

		Scanner scn =  new Scanner(System.in);
		int ch = scn.nextInt();

		switch(ch) {
		case 1: EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
		List<EmployeeBean> result = dao.getAllEmployeeData();

		for(EmployeeBean bean : result) {
			System.out.println("Id : "+bean.getId());
			System.out.println("Name : "+bean.getName());
			System.out.println("Gender : "+bean.getGender());
			System.out.println("Salary : "+bean.getSal());
		}
		break;
		case 2: EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
		EmployeeBean bean2 = new EmployeeBean();
		int inserting = dao2.insertEmployeeData(bean2);
		if(bean2 != null) {
			System.out.println("inserted");
		}else {
			System.out.println("failed to insert");
		}
			break;

		case 3:EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();	
		//int id2 = scn.nextInt();
		EmployeeBean bean4 = new EmployeeBean();
		int modify = dao3.updateEmployeeData(bean4);
		if(bean4 != null) {
			System.out.println("updated");
		}else {
			System.out.println("not updated");
		}
		
			break;

		case 4:EmployeeDAO dao4 = EmployeeManager.getEmployeeDAO();
				int id1 = scn.nextInt();
				EmployeeBean bean1 = new EmployeeBean();
				 int del = dao4.deleteEmployeeData(id1);
				if(bean1 != null) {
					System.out.println("deleted");
				}else {
					System.out.println("no data found");
				}
		
			break;

		case 5:  EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
				int id = scn.nextInt();
				EmployeeBean bean = dao5.searchEmployeeData(id);
				if(bean != null) {
					System.out.println("Id : "+bean.getId());
					System.out.println("Name : "+bean.getName());
					System.out.println("Gender : "+bean.getGender());
					System.out.println("Salary : "+bean.getSal());
				}else {
					System.out.println("no data found");
				}
				
				break;
				default:
					break;
		}
				
	}
}

