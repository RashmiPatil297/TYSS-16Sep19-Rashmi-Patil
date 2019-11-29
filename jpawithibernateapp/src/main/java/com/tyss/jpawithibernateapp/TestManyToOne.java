package com.tyss.jpawithibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernateapp.onetomany.Pencil;
import com.tyss.jpawithibernateapp.onetomany.PencilBox;

public class TestManyToOne {
	public static void main(String[] args) {
		
		PencilBox pb = new PencilBox();
		pb.setBId(1);
		pb.setBName("Apsara");
	
		Pencil p1 = new Pencil();
		p1.setPid(10);
		p1.setColor("red");
		p1.setPencilBox(pb);
		
		Pencil p2 = new Pencil();
		p2.setPid(20);
		p2.setColor("black");
		p2.setPencilBox(pb);
		
		
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		//VoterId vId = entityManager.find(VoterId.class, 1);
		//System.out.println(vId.getPerson().getId());
		entityManager.persist(p1);
		entityManager.persist(p2);
		System.out.println("Record saved");
		entityTransaction.commit();
		}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
		}
		entityManager.close();
	}


	}

