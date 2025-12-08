package com.raj.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class HeartbeatScheduler implements HeartbeatService {

	@Override
	@Scheduled(fixedDelay = 3000)
	public void sendPing() {
		
		System.out.println("Ping sent at "+LocalDateTime.now());

	}

}
