package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.PassengerService;

@SpringBootApplication
public class BootProj19AirlinePassengerCheckInSystemApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj19AirlinePassengerCheckInSystemApplication.class, args);){
			
			PassengerService passengerService = ctx.getBean(PassengerService.class);
			passengerService.displayPassengerInfo();
			
		}
	}

}
