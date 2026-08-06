package com.librarymanage;

public class Student extends User {

	public Student(int bookId, String bookName) {
		super(bookId, bookName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fineCalculation(int day) {
		if (day >= 5) {
			int fine = (day - 5) * 5;
			System.out.println("Student Fine: " + fine);
		}
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
