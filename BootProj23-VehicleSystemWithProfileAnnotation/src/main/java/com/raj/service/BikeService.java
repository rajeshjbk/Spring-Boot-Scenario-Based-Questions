package com.raj.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class BikeService implements VehicleService{

	@Override
	public String getVehicles() {
		
		return "Bikes -> Pulsar, Apache";
	}
}
