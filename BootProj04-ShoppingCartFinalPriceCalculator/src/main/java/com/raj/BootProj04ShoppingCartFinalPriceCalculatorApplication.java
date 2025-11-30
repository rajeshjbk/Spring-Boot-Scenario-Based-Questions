package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.CartService;

@SpringBootApplication
public class BootProj04ShoppingCartFinalPriceCalculatorApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj04ShoppingCartFinalPriceCalculatorApplication.class, args);){
			
			CartService cartService = ctx.getBean(CartService.class);
			double checkout = cartService.checkout(5000, "ELECTRONICS");
			
			System.out.println("Final price: "+checkout);
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
