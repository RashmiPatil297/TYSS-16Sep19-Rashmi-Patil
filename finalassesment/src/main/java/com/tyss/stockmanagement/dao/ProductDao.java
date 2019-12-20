package com.tyss.stockmanagement.dao;

import java.util.List;

import com.tyss.stockmanagement.dto.ProductInfo;

public interface ProductDao {
	public boolean addProduct(ProductInfo product);
	public boolean modifyProduct(ProductInfo product);
	public boolean search(String name);
	public boolean addToCart();
	

}
