package com.raj.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class TruckService implements VehicleService{

	@Override
	public String getVehicles() {
		
		return "Truck -> Tata Truck, Ashok Leyland";
	}
}
