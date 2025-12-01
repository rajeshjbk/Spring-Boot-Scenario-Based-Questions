package com.raj.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "player")
public class PlayerConfig {

	private int playerId;

	private String playerName;

	private int yearsNumber;

	private String teamName;
}
