package com.raj.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.raj.model.Notification;

@Service
@Profile("prod")
public class PushNotificationService implements NotificationService {

	@Override
	public String sendNotification(Notification notification) {
		
		
		return "Sending Push Notification to "+notification.getRecipient()+": "+notification.getMessage();
	}

}
