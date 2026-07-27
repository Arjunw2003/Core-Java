package com.practiceSession;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BankAccount bank = new BankAccount(2000);

		int choice;

		do {
			System.out.println("\n===== ATM MENU =====");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");

			System.out.print("Enter Choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Deposit Amount: ");
				double deposit = sc.nextDouble();
				bank.deposit(deposit);
				break;

			case 2:
				System.out.print("Enter Withdraw Amount: ");
				double withdraw = sc.nextDouble();
				bank.withdraw(withdraw);
				break;

			case 3:
				System.out.println("Current Balance = " + bank.getBalance());
				break;

			case 4:
				System.out.println("Thank You for Using Bank.");
				break;

			default:
				System.out.println("Invalid Choice!");
			}

		} while (choice != 4);

	}
}
