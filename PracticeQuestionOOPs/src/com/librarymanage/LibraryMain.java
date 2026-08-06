package com.librarymanage;

public class LibraryMain {

	public static void main(String[] args) {

		User u;

		System.err.println("=========Student===========");
		u = new Student(12, "Java");
		u.bookDetails();
		u.issueBook();
		u.returnBook();
		u.fineCalculation(7);

		System.err.println("==============Librarian============");
		u = new Librarian(14, "Python");
		u.bookDetails();
		u.issueBook();
		u.returnBook();
		u.fineCalculation(7);
	}
}
