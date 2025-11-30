package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.FeeCalculator;

@SpringBootApplication
public class BootProj02FitnessCenterMembershipFeeCalculatorApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj02FitnessCenterMembershipFeeCalculatorApplication.class, args);){
			
			FeeCalculator feeCalculator = ctx.getBean(FeeCalculator.class);
			
			double bill = feeCalculator.generateBill("premium", true);
			
			System.out.println("Final Bill : "+bill);
		
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
