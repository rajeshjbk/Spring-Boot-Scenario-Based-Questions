package com.raj.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "subscription")
public class SubscriptionConfig {

	private int userId;

	private String userName;

	private String plan;

	private int[] watchTimeHours;

	private List<String> genresPreferred;

	private Set<String> activeDevices;

	private Map<String, Integer> ratings;

	private Map<String, String> lastWatched;

}
