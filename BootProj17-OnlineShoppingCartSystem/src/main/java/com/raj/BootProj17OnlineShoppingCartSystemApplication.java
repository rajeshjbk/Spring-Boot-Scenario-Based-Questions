package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.ShoppingService;

@SpringBootApplication
public class BootProj17OnlineShoppingCartSystemApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj17OnlineShoppingCartSystemApplication.class, args);){
			
			ShoppingService shoppingService = ctx.getBean(ShoppingService.class);
			shoppingService.displayCartInfo();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
