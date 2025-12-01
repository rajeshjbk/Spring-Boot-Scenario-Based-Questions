package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("calculator")
public class PriceCalculator {

	@Value("1500")
	private double basePrice;
	
	@Value("#{1500 * 0.18}")
	private double gstAmount;
	
	@Value("#{1500 * 0.10}")
	private double discountAmount;
	
	@Value("#{1500 + (1500*0.18) - (1500*0.10)}")
	private double finalPrice;
	
}
