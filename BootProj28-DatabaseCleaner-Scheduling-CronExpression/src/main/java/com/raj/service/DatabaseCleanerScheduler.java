package com.raj.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCleanerScheduler implements LogCleanerService {

	@Override
	@Scheduled(cron = "0 0/10 * * * *")
	public void cleanOldLogs() {
		
		System.out.println("Deleted X logs older than Y days at: "+LocalDateTime.now());

	}

}
