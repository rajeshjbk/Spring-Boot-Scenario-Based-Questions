package com.raj.sbeans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PassengerService {

	@Autowired
	private PassengerConfig config;
	
	public void displayPassengerInfo(){
		
		System.out.println("\nAirline Check-In Details:");
		System.out.println("Passenger ID\t: "+config.getPassengerId());
		System.out.println("Passenger Name\t: "+config.getPassengerName());
		System.out.println("Flight No\t: "+config.getFlight());
		System.out.println("\nSeat Preferences: "+config.getSeatPreferences());
		System.out.println("Baggage Weights\t: "+Arrays.toString(config.getBaggageWeights()));
		System.out.println("Special Help\t: "+config.getSpecialAssistance());
		
		System.out.println("\nMeal Choices\t: ");
		config.getMeals().forEach((x,y)->System.out.println(x+"\t = "+y));
		
		System.out.println("\nTravel History\t: ");
		config.getHistory().forEach((x,y)->System.out.println(x+" = "+y));
	}
}
