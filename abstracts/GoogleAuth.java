package com.abstracts;

public class GoogleAuth implements Authentication {

	@Override
	public void login() {
		System.out.println("Login using Google Account");

	}

	@Override
	public void logout() {
		System.out.println("Logout from Google Account");

	}

}
