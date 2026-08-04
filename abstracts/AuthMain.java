package com.abstracts;

public class AuthMain {

	public static void main(String[] args) {

		Authentication auth;

		auth = new GoogleAuth();
		auth.login();
		auth.logout();
		System.out.println();

		auth = new FacebookAuth();
		auth.login();
		auth.logout();
	}
}
