package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component
public class DiscountService {

	public double getCategoryDiscount(String category) {
		
		if(category.equalsIgnoreCase("grocery"))
			return 5;
		else if(category.equalsIgnoreCase("fashion"))
			return 8;
		else if(category.equalsIgnoreCase("electronics"))
			return 10;
		else
			throw new IllegalArgumentException("Invalid category");
	}
	
	public double getFestivalDiscount() {
		
		return 5;
	}
}
