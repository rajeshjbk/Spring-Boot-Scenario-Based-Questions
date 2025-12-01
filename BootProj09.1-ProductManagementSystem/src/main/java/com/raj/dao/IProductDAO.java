package com.raj.dao;

import java.util.List;

import com.raj.model.Product;

public interface IProductDAO {

	int addProduct(Product prod) throws Exception;
	List<Product> getAllProducts() throws Exception;
	int updateProductPrice(int pId, double newPrice) throws Exception;
	int deleteProduct(int pId) throws Exception;
	
}
