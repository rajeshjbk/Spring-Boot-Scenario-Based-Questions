package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.Motor;

@SpringBootApplication
public class BootProj06VehicleManagementSystemApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx = 
				SpringApplication.run(BootProj06VehicleManagementSystemApplication.class, args);){
			
			Motor motor = ctx.getBean(Motor.class);
			System.out.println(motor);
			
		}catch (Exception e) {
			
		    e.printStackTrace();
		
		}
	}

}
