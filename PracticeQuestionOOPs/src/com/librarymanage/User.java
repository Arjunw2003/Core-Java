package com.librarymanage;

public abstract class User implements IssueBook {

	private int bookId;
	private  String bookName;

	public User(int bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;

	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void bookDetails() {
		System.out.println("Book Id: " + bookId);
		System.out.println("Book Name: " + bookName);
	}

	public abstract void fineCalculation(int day);

}
