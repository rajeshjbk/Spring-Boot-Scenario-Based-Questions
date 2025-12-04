package com.raj.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raj.model.Notification;
import com.raj.service.NotificationService;

@Component
public class NotificationTestRunner implements CommandLineRunner{

	@Autowired
	private NotificationService notificationService;

	@Override
	public void run(String... args) throws Exception {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Enter Notification Id: ");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Recipient: ");
			String recipient = sc.nextLine();
			
			System.out.println("Enter Message: ");
			String message = sc.nextLine();
			
			String sendNotification = notificationService.sendNotification(new Notification(id, message, recipient));
			System.out.println(sendNotification);
			
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
}
