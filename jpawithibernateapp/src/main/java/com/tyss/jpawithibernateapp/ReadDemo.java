package com.tyss.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithibernateapp.dto.ProductInfo;

public class ReadDemo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		ProductInfo productDetail = entityManager.find(ProductInfo.class, 102);
		System.out.println("ID ----"+productDetail.getPid());
		System.out.println("Name ----"+productDetail.getPname());
		System.out.println("Quantity ----"+productDetail.getQuantity());
		entityManager.close();
		
	}
}
