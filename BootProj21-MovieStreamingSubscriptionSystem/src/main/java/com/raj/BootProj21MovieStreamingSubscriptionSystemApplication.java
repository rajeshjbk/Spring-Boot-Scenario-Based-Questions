package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.sbeans.SubscriptionService;

@SpringBootApplication
public class BootProj21MovieStreamingSubscriptionSystemApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx =
				SpringApplication.run(BootProj21MovieStreamingSubscriptionSystemApplication.class, args);){
			
			SubscriptionService subscriptionService = ctx.getBean(SubscriptionService.class);
			subscriptionService.displaySubscriptionInfo();
			
		}catch (Exception e) {
		   
			e.printStackTrace();
		}
	}

}
