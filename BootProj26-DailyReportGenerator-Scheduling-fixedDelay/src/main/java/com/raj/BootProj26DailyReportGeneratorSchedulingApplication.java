package com.raj;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProj26DailyReportGeneratorSchedulingApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BootProj26DailyReportGeneratorSchedulingApplication.class, args);
		System.out.println("Main started at: "+LocalDateTime.now());
	}

}
