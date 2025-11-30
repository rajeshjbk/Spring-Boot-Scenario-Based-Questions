package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanCalculator {

	@Autowired
	InterestService interestService;
	
	public double calculateMonthlyInterest(double principal, double rate) {
		
		return (principal * rate) / 12 / 100;

	}
	
	public double calculateEMI(double principal, int months, String type) {
		
		double rate = interestService.getRate(type);
		double calculateMonthlyInterest = calculateMonthlyInterest(principal, rate);
		
		return months*calculateMonthlyInterest;
	}

	public double getProcessingFee(String type) {
		
		if(type.equalsIgnoreCase("home")) {
			return 1000;
		}else if(type.equalsIgnoreCase("personal")||type.equalsIgnoreCase("vehicle")) {
			return 2000;
		}else {
			throw new IllegalArgumentException("Invalid type");
		}
	}
	
	public double generateFinalAmount(double principal, String type, int months) {
		
		double processingFee = getProcessingFee(type);
		double calculateEMI = calculateEMI(principal, months, type);
		
		return principal+calculateEMI+processingFee;
	}

}
