package com.pratice;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Initial Balance: ");
		double balance = sc.nextDouble();

		BankAccount bk;
		bk = new BankSecurity(balance);
		bk.getbalance();

		int choice;
		do {
			System.out.println("=======Bank Menu=========");
			System.out.println("1. Deposite ");
			System.out.println("2. Withdraw");
			System.out.println("3. GetBallance");
			System.out.println("4. Exit");

			System.out.print("Enter your Choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Deposit Amount: ");
				int amount = sc.nextInt();
				bk.deposit(amount);
				break;
			case 2:
				System.out.print("Enter Withdraw Amount: ");
				int amount1 = sc.nextInt();
				bk.withdraw(amount1);
				break;

			case 3:
				bk.getbalance();
				break;

			case 4:
				System.err.println("Thank You for Visiting Bank");
				break;

			default:
				System.err.println("Enter Valid Choice No");
				break;
			}

		} while (choice != 4);

//		bk.deposit(0);
//		bk.getbalance();
//
//		bk.withdraw(1000);
//		bk.getbalance();
	}
}
