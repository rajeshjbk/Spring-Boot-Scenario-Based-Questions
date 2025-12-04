package com.raj.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class CarService implements VehicleService{

	@Override
	public String getVehicles() {
		
		return "Car -> Swift, Innova";
	}
}
