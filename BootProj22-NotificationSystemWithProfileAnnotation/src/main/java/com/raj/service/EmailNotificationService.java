package com.raj.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raj.model.Notification;

@Service
@Profile("dev")
public class EmailNotificationService implements NotificationService {

	@Override
	public String sendNotification(Notification notification) {
		
		
		return "Sending Email to "+notification.getRecipient()+": "+notification.getMessage();
	}

}
