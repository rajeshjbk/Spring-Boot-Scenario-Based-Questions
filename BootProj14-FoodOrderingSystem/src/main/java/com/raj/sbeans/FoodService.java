package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

	@Autowired
	FoodProperties foodProperties;
	
	public void displayFoodInfo() {
		
		System.out.println("Food Details: ");
		System.out.println("Food ID: "+foodProperties.getId());
		System.out.println("Food Name: "+foodProperties.getName());
		System.out.println("Preparation Time: "+foodProperties.getPreparationTime()+" minutes");
		System.out.println("Restaurant Name: "+foodProperties.getRestaurantName());
	}
}
