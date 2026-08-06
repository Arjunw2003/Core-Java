package com.librarymanage;

public class Librarian extends User {

	public Librarian(int bookId, String bookName) {
		super(bookId, bookName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fineCalculation(int day) {
		System.out.println("Librarian No fine");

	}

	@Override
	public void issueBook() {
		System.out.println("Book Issue Successfully");

	}

	@Override
	public void returnBook() {
		System.out.println("Book Return Successfully");

	}

}
