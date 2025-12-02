package com.raj.sbeans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

	@Autowired
	private Hotel hotel;
	
	public void displayReservationInfo(){
		
		System.out.println("Hotel Information: ");
		System.out.println("Hotel Name\t: "+hotel.getHotelName());
		System.out.println("Location\t: "+hotel.getLocation());
		
		System.out.println("Guest Details:");
		System.out.println("ID\t: "+hotel.getGuest().getGuestId());
		System.out.println("Name\t: "+hotel.getGuest().getGuestName());
		
		System.out.println("Past Rooms\t: "+Arrays.toString(hotel.getGuest().getPastRooms()));
		System.out.println("Services\t: "+hotel.getGuest().getServices());
		System.out.println("Preferences\t: "+hotel.getGuest().getPreferences());
		System.out.println("Visit History\t: ");
		hotel.getGuest().getHistory().forEach((x,y)->{
			
			System.out.println(x+" = "+y);
		});
	}
}

