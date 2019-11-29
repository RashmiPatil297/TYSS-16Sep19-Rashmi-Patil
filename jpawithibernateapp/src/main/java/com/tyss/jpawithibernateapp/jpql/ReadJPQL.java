package com.tyss.jpawithibernateapp.jpql;


import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.jpawithibernateapp.dto.ProductInfo;

public class ReadJPQL {
	public static void main(String[] args) {
		  
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
		String jpql = "select pname from ProductInfo";
		Query query = entityManager.createQuery(jpql);
		List<String> list = query.getResultList();
		/*
		 * Iterator<ProductInfo> it = list.iterator(); while(it.hasNext()) {
		 * System.out.println("list "+it.next()); }
		 */
		for (String productInfo : list) {
			System.out.println(productInfo);
			//System.out.println(productInfo.getPname());
			//System.out.println(productInfo.getQuantity());
		}
		entityManager.close();
		
		
		
		
	}

}
