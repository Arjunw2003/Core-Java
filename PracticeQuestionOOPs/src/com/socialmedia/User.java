package com.socialmedia;

public abstract class User implements PostActions {

	private String post;
	private String caption;

	public User(String post, String caption) {
		this.post = post;
		this.caption = caption;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public abstract void handlePost();

	public void postDetails() {
		System.out.println("Post: " + post);
		System.out.println("Caption: " + caption);
	}
}
