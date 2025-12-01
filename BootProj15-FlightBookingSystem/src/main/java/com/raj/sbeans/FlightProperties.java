package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "org.raj.flight")
public class FlightProperties {

	private String flightNumber;

	private String departureCity;

	private String destinationCity;

	private double ticketPrice;
	
	@Autowired
	private User user;
	
	public void bookingInfo() {
		
		System.out.println("Flight Details:");
		System.out.println("Flight Number\t\t: "+flightNumber);
		System.out.println("Departure City\t\t: "+departureCity);
		System.out.println("Destination City\t: "+destinationCity);
		System.out.println("Ticket Price\t\t: "+ticketPrice);
		
		System.out.println();
		
		user.showUserDetails();
	}
}
