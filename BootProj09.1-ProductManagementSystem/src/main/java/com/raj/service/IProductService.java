package com.raj.service;

import java.util.List;

import com.raj.model.Product;

public interface IProductService {

	String addProduct(Product prod) throws Exception;
	
	List<Product> getAllProducts() throws Exception;
	
	String updateProduct(int pId, double newPrice) throws Exception;
	
	String deleteProduct(int pId) throws Exception;
}
