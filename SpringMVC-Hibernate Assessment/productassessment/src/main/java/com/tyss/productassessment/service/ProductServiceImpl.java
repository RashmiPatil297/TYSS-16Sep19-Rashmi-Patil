package com.tyss.productassessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.productassessment.dao.ProductDAO;
import com.tyss.productassessment.dto.Retailer;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;
	@Override
	public Retailer login(int id, String password) {
		// TODO Auto-generated method stub
		return dao.login(id, password);
	}

	@Override
	public int register(Retailer bean) {
		// TODO Auto-generated method stub
		return dao.register(bean);
	}

	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(id);
	}

	@Override
	public Retailer searchProduct(int id) {
		// TODO Auto-generated method stub
		return dao.searchProduct(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id, password);
	}

	

}
