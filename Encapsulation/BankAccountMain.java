package Encapsulation;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();

		BankAccount bk = new BankAccount();
		bk.setBalance(balance);
		System.out.println("Balance: " + bk.getBalance());

		int choice;

		do {
			System.out.println("\n===== Bank MENU =====");
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
				bk.deposit(deposit);
				break;

			case 2:
				System.out.print("Enter Withdraw Amount: ");
				double withdraw = sc.nextDouble();
				bk.withdraw(withdraw);
				break;

			case 3:
				System.out.println("Available Balance: " + bk.getBalance());
				break;

			case 4:
				System.out.println("Thank You for visit Bank");
				break;

			default:
				System.out.println("Invalid Choice");
			}
		} while (choice != 4);
	}

}
