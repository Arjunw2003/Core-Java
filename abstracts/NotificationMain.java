package com.abstracts;

public class NotificationMain {

	public static void main(String[] args) {

		Notification n;

		n = new EmailNotification();
		n.sendMessage("Hi Am Arjun");

		n = new SMSNotification();
		n.sendMessage("SMS Send");

		n = new WhatsAppNotification();
		n.sendMessage("Hii Kiran");
	}
}
