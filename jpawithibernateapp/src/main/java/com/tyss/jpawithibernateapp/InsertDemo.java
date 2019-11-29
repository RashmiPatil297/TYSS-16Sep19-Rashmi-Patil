package com.tyss.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernateapp.dto.ProductInfo;

public class InsertDemo {
	public static void main(String[] args) {
		
		ProductInfo productInfo = new ProductInfo();
		productInfo.setPid(103);
		productInfo.setPname("Pen");
		productInfo.setQuantity(5);
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
