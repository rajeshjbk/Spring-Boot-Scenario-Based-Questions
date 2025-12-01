package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

	@Autowired
	private PlayerConfig playerConfig;
	
	public void displayPlayerInfo() {
		System.out.println("Player Information: ");
		System.out.println("Player ID: "+playerConfig.getPlayerId());
		System.out.println("Player Name: "+playerConfig.getPlayerName());
		System.out.println("Year Number: "+playerConfig.getYearsNumber());
		System.out.println("Team Name: "+playerConfig.getTeamName());
	}
}
