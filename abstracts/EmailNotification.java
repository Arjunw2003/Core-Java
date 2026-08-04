package com.abstracts;

public class EmailNotification implements Notification {

	@Override
	public void sendMessage(String msg) {
		System.out.println("Email Notification: " + msg);

	}

}
