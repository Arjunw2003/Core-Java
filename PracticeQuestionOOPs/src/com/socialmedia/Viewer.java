package com.socialmedia;

public class Viewer extends User {

	public Viewer(String post, String caption) {
		super(post, caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void likePost() {
		System.out.println("Viewer Like Post");

	}

	@Override
	public void commentPost() {
		System.out.println("Viewer Comment Post");

	}

	@Override
	public void handlePost() {
		System.out.println("Viewer View Post");
	}

}
