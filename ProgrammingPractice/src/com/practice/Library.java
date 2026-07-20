package com.practice;

class Library {

	String bookName;
	boolean isIssued;

	public Library(String bookName, boolean isIssued) {
		this.bookName = bookName;
		this.isIssued = isIssued;
	}

	// Issue Book
	public void issueBook() {

		if (isIssued) {
			System.out.println("Book is already issued.");
		} else {
			isIssued = true;
			System.out.println("Book issued successfully.");
		}
	}

	// Return Book
	public void returnBook() {

		if (!isIssued) {
			System.out.println("Book is already available in library.");
		} else {
			isIssued = false;
			System.out.println("Book returned successfully.");
		}
	}
}
