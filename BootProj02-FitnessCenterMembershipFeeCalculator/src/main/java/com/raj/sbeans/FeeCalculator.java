package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeeCalculator {

	@Autowired
	MembershipService membershipService;
	
	public double calculateTotal(String type, boolean trainer) {
		
		double baseFee = membershipService.getBaseFee(type);
		double trainerFee = membershipService.getTrainerFee(trainer);
		
		double total = baseFee + trainerFee;
		
		return total;
	}
	
	public double applyOffer(double total,String type) {
		
		double offer = 0;
		if(type.equalsIgnoreCase("Premium")) {
			
			offer = total*15/100;
			
			return offer;
		}
		return offer;
	}
	
	public double generateBill(String type, boolean trainer) {
		
		double total = calculateTotal(type, trainer);
		double offer = applyOffer(total, type);
		
		return total-offer;
	}
}
