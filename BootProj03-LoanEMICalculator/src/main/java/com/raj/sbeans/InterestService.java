package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component
public class InterestService {

	public double getRate(String loanType) {
		
		if(loanType.equalsIgnoreCase("home")) {
			
			return 7;
		}else if(loanType.equalsIgnoreCase("personal")) {
			
			return 11;
		}else if(loanType.equalsIgnoreCase("vehicle")) {
			
			return 9;
		}
		else {
		 
			throw new IllegalArgumentException("Invalid loanType");
		}
	}
}
