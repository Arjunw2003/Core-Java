package com.polymorphism;

public class Instagram {

//	String username;
//	String password;
//
//	public Instagram(String username, String password) {
//		this.username = username;
//		this.password = password;
//
//	}

	public void login(String username) {
		System.out.println("UserName: " + username);
	}

	public void login(String username, String password) {
		System.out.println("UserName: " + username + " " + "Password: " + password);
	}
}
