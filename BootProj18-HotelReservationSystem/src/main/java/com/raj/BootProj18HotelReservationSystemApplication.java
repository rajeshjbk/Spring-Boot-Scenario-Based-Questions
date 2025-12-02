package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.ReservationService;

@SpringBootApplication
public class BootProj18HotelReservationSystemApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj18HotelReservationSystemApplication.class, args);){
			
			ReservationService reservationService = ctx.getBean(ReservationService.class);
			reservationService.displayReservationInfo();
		}
	}

}
