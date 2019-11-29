package com.tyss.jpawithibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithibernateapp.manytomany.Course;
import com.tyss.jpawithibernateapp.manytomany.Student;
import com.tyss.jpawithibernateapp.onetomany.Pencil;
import com.tyss.jpawithibernateapp.onetomany.PencilBox;

public class TestManyToMany {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		
		Course c1 = new  Course();
		c1.setId(1);
		c1.setCname("java");
		Course c2 = new  Course();
		c2.setId(2);
		c2.setCname("sql");
		
		ArrayList<Course> aCourses = new ArrayList<Course>();
		aCourses.add(c1);
		aCourses.add(c2);
		
		
		Student s = new Student();
		s.setSid(2);
		s.setSname("vishwa");
		s.setCourses(aCourses);
		
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		//VoterId vId = entityManager.find(VoterId.class, 1);
		//System.out.println(vId.getPerson().getId());
		entityManager.persist(s);
		//entityManager.persist(c2);
		System.out.println("Record saved");
		entityTransaction.commit();
		}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
		}
		entityManager.close();
	}



	}


