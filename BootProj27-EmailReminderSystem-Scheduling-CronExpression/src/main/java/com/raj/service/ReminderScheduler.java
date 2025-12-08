package com.raj.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class ReminderScheduler implements ReminderService {

	@Override
	@Scheduled(cron = "0 0 9 * * *")
	public void sendMorningReminder() {
		
        System.out.println("Good Morning at: "+LocalDateTime.now());
	}

	@Override
	@Scheduled(cron = "0 0 18 * * *")
	public void sendEveningReminder() {
		
		System.out.println("Good Evening at: "+LocalDateTime.now());

	}

}
