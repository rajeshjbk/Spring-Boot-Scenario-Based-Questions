package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "org.raj.user")
public class User {

	private int userId;

	private String userName;
	
    @Autowired
	private Address address;
    
    public void showUserDetails() {
    	
    	System.out.println("User Details:");
    	System.out.println("User ID\t\t: "+userId);
    	System.out.println("User Name\t: "+userName);
    	
    	System.out.println();
    	address.showAddress();
    }
}
