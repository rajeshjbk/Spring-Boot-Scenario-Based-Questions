package com.raj.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SocialMediaScheduler implements SocialMediaService{

	@Override
	@Scheduled(fixedDelay = 6000)
	public void autoPostContent() {
		
		System.out.println("New post published at: "+new Date());
	}

	@Override
	@Scheduled(fixedRate = 8000)
	public void checkEngagement() {
		
		System.out.println("Checked engagement at: "+new Date());
		
	}
}
