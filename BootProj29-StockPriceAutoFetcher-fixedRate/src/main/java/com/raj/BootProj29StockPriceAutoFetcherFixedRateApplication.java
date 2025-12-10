package com.raj;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProj29StockPriceAutoFetcherFixedRateApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BootProj29StockPriceAutoFetcherFixedRateApplication.class, args);
	    System.out.println("Main method started at: "+new Date());
	    
	}

}
