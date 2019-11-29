package com.tyss.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernateapp.dto.ProductInfo;
import com.tyss.jpawithibernateapp.onetoone.Person;
import com.tyss.jpawithibernateapp.onetoone.VoterId;

public class TestOneToOne {

	public static void main(String[] args) {
		VoterId vc = new VoterId();
		vc.setVid(1);
		vc.setVname("Raksha");
		Person p = new Person();
		p.setId(1);
		p.setName("Rashmi");
		p.setVoterId(vc);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		VoterId vId = entityManager.find(VoterId.class, 1);
		System.out.println(vId.getPerson().getId());
		//entityManager.persist(p);
		System.out.println("Record saved");
		entityTransaction.commit();
		}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
		}
		entityManager.close();
	}

	}

