package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BillingService {

	@Value("#{calculator}")
	private PriceCalculator calc;
	
	public void generateBill(){
		
		System.out.println(calc);
	}
}
