package com.tyss.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.stockmanagement.dto.OrderInfo;
import com.tyss.stockmanagement.dto.ProductInfo;
@Repository
public class ProductDaoImpl implements ProductDao{
	@PersistenceUnit
	EntityManagerFactory entityManagerFactory  = null;
	@Override
	public boolean addProduct(ProductInfo product) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(product);
		transaction.commit();
		return true;
	}

	@Override
	public boolean modifyProduct(ProductInfo product) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProductInfo productInfo = new ProductInfo();
		entityManager.find(ProductInfo.class, product.getId());
		productInfo.setName("name");
		productInfo.setCategory("category");
		productInfo.setCompany("company");
		return true;

	}

	@Override
	public boolean search(String name) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProductInfo productInfo = new ProductInfo();
		ProductInfo name2 = entityManager.find(ProductInfo.class, productInfo.getName());
		if(name.equals(name2)) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean addToCart() {
		EntityManager entityManager = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("product");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from OrderInfo";
			TypedQuery<OrderInfo> query = entityManager.createQuery(jpql, OrderInfo.class);
			List<OrderInfo> list = query.getResultList();
			if (!list.isEmpty()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}



}
