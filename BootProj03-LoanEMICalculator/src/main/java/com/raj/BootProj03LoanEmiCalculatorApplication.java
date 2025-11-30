package com.raj;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.raj.sbeans.LoanCalculator;

@SpringBootApplication
public class BootProj03LoanEmiCalculatorApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj03LoanEmiCalculatorApplication.class, args);){
			
			LoanCalculator loanCalculator = ctx.getBean(LoanCalculator.class);
			
			System.out.println("Total EMI Amount: "+loanCalculator.generateFinalAmount(500000, "vehicle", 6));
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
