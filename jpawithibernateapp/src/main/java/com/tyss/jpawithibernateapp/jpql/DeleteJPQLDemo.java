package com.tyss.jpawithibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteJPQLDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager = entityManagerFactory.createEntityManager();
	     entityTransaction = entityManager.getTransaction();
	    entityTransaction.begin();
		String jpql = "delete from ProductInfo where pid=103";
		Query query = entityManager.createQuery(jpql);
		int i = query.executeUpdate();
		System.out.println(i);
		entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();
		}
		
			

		entityManager.close();
		
	}



}
