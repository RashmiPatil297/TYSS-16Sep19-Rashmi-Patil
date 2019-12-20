package com.tyss.stockmanagement.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.stockmanagement.dao.ProductDao;
import com.tyss.stockmanagement.dto.ProductInfo;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
	ProductDao dao;
	@Override
	public boolean addProduct(ProductInfo product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean modifyProduct(ProductInfo product) {
		return dao.modifyProduct(product);
	}

	@Override
	public boolean search(String name) {
		return dao.search(name);
	}

	@Override
	public boolean addToCart() {
		return dao.addToCart();
	}

	
}
