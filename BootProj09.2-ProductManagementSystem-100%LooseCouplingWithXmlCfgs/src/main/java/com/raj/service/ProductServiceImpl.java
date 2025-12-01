package com.raj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.raj.dao.IProductDAO;
import com.raj.model.Product;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	@Qualifier("dao")
	private IProductDAO productDAO;

	@Override
	public String addProduct(Product prod) throws Exception {
		
		int count = productDAO.addProduct(prod);
		return count==1?"Product is added successfully.":"Product is not added.";
	}

	@Override
	public List<Product> getAllProducts() throws Exception {
		
		List<Product> allProducts = productDAO.getAllProducts();
		
		return allProducts;
	}

	@Override
	public String updateProduct(int pId, double newPrice) throws Exception {
		
		int count = productDAO.updateProductPrice(pId, newPrice);
		return count==1?"PID:"+pId+" is Updated successfully.":"PID:"+pId+" is not Updated successfully.";
	}

	@Override
	public String deleteProduct(int pId) throws Exception {

         int count = productDAO.deleteProduct(pId);
		return count==1?"PID:"+pId+" is Deleted successfully.":"PID:"+pId+" is not Deleted successfully.";
	}
}
