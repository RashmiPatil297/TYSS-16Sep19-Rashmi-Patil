package com.tyss.productassessment.dao;

import com.tyss.productassessment.dto.Retailer;

public interface ProductDAO {
	
	public Retailer login(int id, String password);
	public int register(Retailer bean);
	public boolean deleteProduct(int id);
	public Retailer searchProduct(int id);
	public boolean changePassword(int id,String password);
	

}
