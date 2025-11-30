package com.raj.sbeans;

import org.springframework.stereotype.Component;

@Component
public class PriceService {

	
	public double calculateUnitCost(int units) {
		
		if(units <= 100) {
			
			return units*5.0;
		}else if(units >= 101 && units <= 200) {
			
			return units*7.0;
		}else {
			
			return units*10.0;
		}
	}
	
	public double calculateFixedCharge() {
		
		return 50.0;
	}
}
