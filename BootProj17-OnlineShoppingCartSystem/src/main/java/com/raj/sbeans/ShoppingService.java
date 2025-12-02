package com.raj.sbeans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ShoppingService {
    
	@Autowired
	private ShoppingCartProperties cartProperties;
	
	public void displayCartInfo() {
		
		System.out.println("Shopping Cart:");
		System.out.println("User\t:"+cartProperties.getUser());
		System.out.println("Total Amount\t: "+cartProperties.getTotalAmount());
		System.out.println("Item Quantities: "+Arrays.toString(cartProperties.getQuantities()));
		System.out.println("Items (List): "+cartProperties.getItems().toString());
		System.out.println("Coupons (Set): "+cartProperties.getCoupons().toString());
		System.out.println("Prices (Map): ");
		cartProperties.getPrices().forEach((x,y)->{
			
			System.out.println(x+" = "+y);
		});
	}
}
