package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component
public class MembershipService {

	public double getBaseFee(String type) {
		
		if(type.equalsIgnoreCase("basic")) {
			
			return 500;
		}else if(type.equalsIgnoreCase("standard")) {
			
			return 800;
		}else if(type.equalsIgnoreCase("premium")) {
			return 1200;
		}else {
			throw new IllegalArgumentException("Invalid type");
		}
	}
	
	public double getTrainerFee(boolean personalTrainer) {
		
		if(personalTrainer==true) {
			
			return 600;
		}else {
			
			return 0;
		}
	}

}
