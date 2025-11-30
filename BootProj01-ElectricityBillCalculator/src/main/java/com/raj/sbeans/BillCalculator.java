package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillCalculator {

	@Autowired
	PriceService priceService;
	
	public double calculateTotalBill(int units) {
		
		double unitCost = priceService.calculateUnitCost(units);
		
		double fixedCharge = priceService.calculateFixedCharge();
		
		double total = unitCost + fixedCharge;
		
		return total;
	}
	
	public double calculateDiscount(double total) {
		
		double discount = 0;
		if(total>1000) {
			
			return discount=total*10/100;
		}
		return discount;
	}
	
	public double generateFinalBill(int units) {
		
		double totalBill = calculateTotalBill(units);
		double discount = calculateDiscount(totalBill);
		
		return totalBill-discount;
	}
}
