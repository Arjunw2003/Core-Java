package com.socialmedia;

public class Creator extends User {

	public Creator(String post, String caption) {
		super(post, caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void likePost() {
		System.out.println("Creater Link Post");

	}

	@Override
	public void commentPost() {
		System.out.println("Creater Comment Post");

	}

	@Override
	public void handlePost() {
		System.out.println("Crater Upload post");

	}

}
