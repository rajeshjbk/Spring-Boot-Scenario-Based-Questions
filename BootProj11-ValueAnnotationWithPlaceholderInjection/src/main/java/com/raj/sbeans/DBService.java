package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class DBService {

	@Autowired
	private DatabaseConfig config;
	
	public void connect() {
		
		System.out.println(config);
	}
}
