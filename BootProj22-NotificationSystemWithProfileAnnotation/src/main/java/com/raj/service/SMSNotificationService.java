package com.raj.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raj.model.Notification;

@Service
@Profile("test")
public class SMSNotificationService implements NotificationService {

	@Override
	public String sendNotification(Notification notification) {
		
		
		return "Sending SMS to "+notification.getRecipient()+": "+notification.getMessage();
	}

}
