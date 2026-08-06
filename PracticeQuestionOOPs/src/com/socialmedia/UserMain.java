package com.socialmedia;

public class UserMain {

	public static void main(String[] args) {

		User u;

		System.err.println("=============Creater===========");
		u = new Creator("Reels", "My reels");
		u.postDetails();
		u.handlePost();
		u.likePost();
		u.commentPost();

		System.err.println("=============Viewer============");
		u = new Viewer("Post", "My post");
		u.postDetails();
		u.handlePost();
		u.likePost();
		u.commentPost();
	}
}
