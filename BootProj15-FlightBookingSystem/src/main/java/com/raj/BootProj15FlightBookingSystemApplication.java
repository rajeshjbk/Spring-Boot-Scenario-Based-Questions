package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.FlightProperties;

@SpringBootApplication
public class BootProj15FlightBookingSystemApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = 
				SpringApplication.run(BootProj15FlightBookingSystemApplication.class, args);){
			
			FlightProperties flightProperties = ctx.getBean(FlightProperties.class);
			flightProperties.bookingInfo();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
