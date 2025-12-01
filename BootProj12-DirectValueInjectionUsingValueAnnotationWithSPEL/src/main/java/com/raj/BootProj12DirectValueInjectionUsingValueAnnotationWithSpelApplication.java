package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.BillingService;

@SpringBootApplication
public class BootProj12DirectValueInjectionUsingValueAnnotationWithSpelApplication {
	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj12DirectValueInjectionUsingValueAnnotationWithSpelApplication.class, args);){
			
			BillingService billingService = ctx.getBean(BillingService.class);
			billingService.generateBill();
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
