package com.practice;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Book Name: ");
		String bookName = sc.nextLine();

		Library lib = new Library(bookName, false);

		int choice;

		do {
			System.out.println("\n===== LIBRARY MENU =====");
			System.out.println("1. Issue Book");
			System.out.println("2. Return Book");
			System.out.println("3. Exit");
			System.out.print("Enter Choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				lib.issueBook();
				break;

			case 2:
				lib.returnBook();
				break;

			case 3:
				System.out.println("Thank You!");
				break;

			default:
				System.out.println("Invalid Choice!");
			}

		} while (choice != 3);

	}
}
