package com.raj;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootProj27EmailReminderSystemSchedulingCronExpressionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj27EmailReminderSystemSchedulingCronExpressionApplication.class, args);
		
		System.out.println("Main Started at: "+LocalDateTime.now());
	}

}
