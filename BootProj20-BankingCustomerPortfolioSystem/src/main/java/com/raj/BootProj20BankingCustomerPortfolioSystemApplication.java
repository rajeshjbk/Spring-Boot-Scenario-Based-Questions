package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.raj.sbeans.CustomerConfig;
import com.raj.sbeans.CustomerService;

@SpringBootApplication
public class BootProj20BankingCustomerPortfolioSystemApplication {
	
	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj20BankingCustomerPortfolioSystemApplication.class, args);){
			
			CustomerService customerService = ctx.getBean(CustomerService.class);
			customerService.displayCustomerInfo();
		}
	}

}
