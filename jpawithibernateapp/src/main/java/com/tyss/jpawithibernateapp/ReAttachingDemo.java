package com.tyss.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernateapp.dto.ProductInfo;

public class ReAttachingDemo {
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		ProductInfo productInfo = entityManager.find(ProductInfo.class, 102);
		System.out.println(entityManager.contains(productInfo));
		entityManager.detach(productInfo);
		System.out.println(entityManager.contains(productInfo));
		ProductInfo productInfo2 = entityManager.merge(productInfo);
		productInfo2.setPname("telephone");
		entityManager.clear();
		System.out.println("Record Updated");
		
		entityTransaction.commit();
		
		}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	
		}
		entityManager.close();
	}

}
