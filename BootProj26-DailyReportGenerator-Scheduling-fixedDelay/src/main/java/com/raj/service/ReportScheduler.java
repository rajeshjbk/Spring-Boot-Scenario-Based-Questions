package com.raj.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportScheduler implements ReportService {

	@Override
//	@Scheduled(fixedRate = 5000)
	@Scheduled(fixedDelay = 7000)
	public void generateReport() {
		
		System.out.println("Report generated at: "+LocalDateTime.now());
	}

}
