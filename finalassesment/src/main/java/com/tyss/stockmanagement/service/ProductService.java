package com.tyss.stockmanagement.service;

import java.util.List;

import com.tyss.stockmanagement.dto.ProductInfo;

public interface ProductService {
	
	public boolean addProduct(ProductInfo product);
	public boolean modifyProduct(ProductInfo product);
	public boolean search(String name);
	public boolean addToCart();
	

}
