package com.raj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raj.service.VehicleService;

@Component
public class VehicleTestRunner implements CommandLineRunner{

	@Autowired
	private VehicleService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		String vehicles = service.getVehicles();
		System.out.println(vehicles);
		
	}

}
