package com.tyss.productassessment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.productassessment.dto.ProductBean;
import com.tyss.productassessment.dto.Retailer;



@Repository
public class ProductDaoImpl implements ProductDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Retailer login(int id, String password) {
		String jpql = "from Retailer where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Retailer> query = manager.createQuery(jpql, Retailer.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
			Retailer bean = query.getSingleResult();
		return bean;
		}catch(Exception e) {
			e.printStackTrace();
		return null;
		}
	}

	@Override
	public int register(Retailer bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	}

	@Override
	public boolean deleteProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Retailer bean = manager.find(Retailer.class, id);
		manager.remove(bean);
		transaction.commit();
		return true;
	}

	@Override
	public ProductBean searchProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		
		return manager.find(ProductBean.class, id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Retailer bean = manager.find(Retailer.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	
		

}
