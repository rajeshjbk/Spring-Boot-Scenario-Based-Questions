package com.raj.sbeans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

	@Autowired
	private SubscriptionConfig subscriptionConfig;
	
	public void displaySubscriptionInfo(){
		
		System.out.println("\nStreaming Subscription Details:");
		System.out.println("User ID\t: "+subscriptionConfig.getUserId());
		System.out.println("User Name: "+subscriptionConfig.getUserName());
		System.out.println("Plan\t: "+subscriptionConfig.getPlan());
		
		System.out.println("\nWatch Time (Hrs): "+Arrays.toString(subscriptionConfig.getWatchTimeHours()));
		System.out.println("Preferred Geres\t: "+subscriptionConfig.getGenresPreferred());
		System.out.println("Active Devices\t: "+subscriptionConfig.getActiveDevices());
		
		System.out.println("Rating\t: ");
		subscriptionConfig.getRatings().forEach((x,y)->System.out.println(x+" = "+y));
		
		System.out.println("Last Watched\t: ");
		subscriptionConfig.getLastWatched().forEach((x,y)->System.out.println(x+" = "+y));
	}
}
