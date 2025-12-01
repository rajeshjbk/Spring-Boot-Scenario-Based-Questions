package com.raj.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "food")
public class FoodProperties {

	private int id;

	private String name;

	private int preparationTime;

	private String restaurantName;
}
