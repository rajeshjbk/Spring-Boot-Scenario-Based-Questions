package com.raj.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.raj.model.BackupInfo;

@Component
public class BackupScheduler implements BackupService{

	@Autowired
	private BackupInfo backupInfo;
	
	@Override
//	@Scheduled(cron = "0 30 6 * * *")
	@Scheduled(cron = "0 26 15 * * *")
	public void createMorningBackup() {
		
		System.out.println("Morning Backup created: "+backupInfo.getFileName()+" at "+new Date());
	}

	@Override
//	@Scheduled(cron = "0 0 22 * * *")
	@Scheduled(cron = "0 28 15 * * *")
	public void createNightBackup() {
		
		System.out.println("Night Backup created: "+backupInfo.getFileName()+" at "+new Date());
	}

	
}
