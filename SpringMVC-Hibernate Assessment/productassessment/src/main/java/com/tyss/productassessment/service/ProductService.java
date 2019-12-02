package com.tyss.productassessment.service;

import com.tyss.productassessment.dto.Retailer;

public interface ProductService {
	
	public Retailer login(int id, String password);
	public int register(Retailer bean);
	public boolean deleteProduct(int id);
	public Retailer searchProduct(int id);
	public boolean changePassword(int id,String password);
	

}
