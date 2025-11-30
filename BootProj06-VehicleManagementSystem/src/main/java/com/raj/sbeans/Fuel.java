package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Fuel {

	@Value("${fuel.type}")
	private String fuelType;
	
	@Value("${fuel.rate}")
	private double fuelRate;
	
	@Value("${fuel.qty}")
	private double fuelQty;

	@Override
	public String toString() {
		return "Fuel [fuelType=" + fuelType + ", fuelRate=" + fuelRate + ", fuelQty=" + fuelQty + "]";
	}
	
}
