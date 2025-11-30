package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartService {

	@Autowired
	DiscountService discountService;
	
	public double calculateCategoryPrice(double price, String category) {
		
		double discount = discountService.getCategoryDiscount(category);
		
		return price*discount/100;
	}

	public double applyFestivalOffer(double price) {
		
		double festivalDiscount = discountService.getFestivalDiscount();
		
		return price*festivalDiscount/100;
	}

	public double calculateTax(double price) {
		
		int tax = 18;
		return price*tax/100;
	}
	
	public double checkout(double price, String category) {
		
		double total = price +calculateTax(price)-calculateCategoryPrice(price, category)-applyFestivalOffer(price);
		
		return total;
	}

}
