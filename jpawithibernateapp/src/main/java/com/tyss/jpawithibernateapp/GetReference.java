package com.tyss.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernateapp.dto.ProductInfo;

public class GetReference {
	public static void main(String[] args) {
		
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		//ProductInfo productInfo= entityManager.find(ProductInfo.class, 101);
		ProductInfo productInfo= entityManager.getReference(ProductInfo.class, 102);
		System.out.println(productInfo.getPid());
		System.out.println(productInfo.getPname());
		System.out.println(productInfo.getQuantity());
		
		entityManager.close();
		

	}

}
