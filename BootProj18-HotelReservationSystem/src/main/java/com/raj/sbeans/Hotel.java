package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("org.raj.hotel")
public class Hotel {

	private String hotelName;

	private String location;
	
	@Autowired
	private Guest guest;
}
