package com.abstracts;

public class FacebookAuth implements Authentication {

	@Override
	public void login() {
		System.out.println("Login using Facebook Account");

	}

	@Override
	public void logout() {
		System.out.println("Logout from Facebook Account");

	}

}
