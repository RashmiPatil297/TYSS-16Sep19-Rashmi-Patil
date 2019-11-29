package com.tyss.assign;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.assign.dto.Emp;

public class InsertDemo {
	
public static void main(String[] args) {
		
		Emp productInfo = new Emp();
		productInfo.setId(102);
		productInfo.setName("Pencil");
		productInfo.setSalary(10);
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(productInfo);
		System.out.println("Record Saved");
		entityTransaction.commit();
		}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
		}
		entityManager.close();
	}

}
