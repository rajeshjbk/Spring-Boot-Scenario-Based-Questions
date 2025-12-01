package com.raj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.raj.model.Product;
import com.raj.service.IProductService;

@Controller
public class ProductController {

	@Autowired
	private IProductService productService;
	
	public String addProduct(Product prod) throws Exception {
		
	   String msg = productService.addProduct(prod);
	   
	   return msg;
	}
	
	public List<Product> getAllProducts() throws Exception{
		
		List<Product> allProducts = productService.getAllProducts();
		
		return allProducts;
	}
	
	public String updateProduct(int pId, double newSalary) throws Exception {
		
		String msg = productService.updateProduct(pId, newSalary);
		
		return msg;
	}
	
	public String deleteProduct(int pId) throws Exception {
		
		String msg = productService.deleteProduct(pId);
		
		return msg;
	}
}
