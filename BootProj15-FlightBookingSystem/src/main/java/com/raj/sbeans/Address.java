package com.raj.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import com.raj.BootProj15FlightBookingSystemApplication;
import lombok.Data;

@Component
@Data
@ConfigurationProperties("org.raj.user.address")
public class Address {

    private final BootProj15FlightBookingSystemApplication bootProj15FlightBookingSystemApplication;

	private String street;

	private String city;

	private String state;

	private int zipCode;

	public void showAddress() {
		
		System.out.println("Address Details:");
		System.out.println("Street\t\t: "+street);
		System.out.println("City\t\t: "+city);
		System.out.println("State\t\t: "+state);
		System.out.println("Zip Code\t: "+zipCode);
	}
}
