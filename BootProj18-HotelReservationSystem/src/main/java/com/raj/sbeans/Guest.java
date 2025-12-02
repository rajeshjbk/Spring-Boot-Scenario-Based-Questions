package com.raj.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("org.raj.guest")
public class Guest {

	private int guestId;

	private String guestName;
	
	private int[] pastRooms;

	private List<String> services;

	private Set<String> preferences;

	private Map<String, Integer> history;

}
