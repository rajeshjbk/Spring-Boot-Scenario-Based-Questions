package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.raj.sbeans.FoodService;

@SpringBootApplication
@PropertySource("com/raj/commons/food.properties")
public class BootProj14FoodOrderingSystemApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj14FoodOrderingSystemApplication.class, args);){
			
			FoodService foodService = ctx.getBean(FoodService.class);
			foodService.displayFoodInfo();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
