package com.tyss.jpawithibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateJPQLDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager = entityManagerFactory.createEntityManager();
	     entityTransaction = entityManager.getTransaction();
	    entityTransaction.begin();
		String jpql = "update ProductInfo set pname='mobile' where pid=102";
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
		/*
		 * Iterator<ProductInfo> it = list.iterator(); while(it.hasNext()) {
		 * System.out.println("list "+it.next()); }
		 */
		
			

		entityManager.close();
		
	}

}
