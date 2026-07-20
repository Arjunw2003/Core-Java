package com.practice;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();

		ATM atm = new ATM(balance);

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
				atm.deposit(deposit);
				break;

			case 2:
				System.out.print("Enter Withdraw Amount: ");
				double withdraw = sc.nextDouble();
				atm.withdraw(withdraw);
				break;

			case 3:
				atm.checkBalance();
				break;

			case 4:
				System.out.println("Thank You for Using ATM.");
				break;

			default:
				System.out.println("Invalid Choice!");
			}

		} while (choice != 4);

	}
}
