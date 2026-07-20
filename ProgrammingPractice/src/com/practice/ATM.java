package com.practice;

class ATM {

	double balance;

	public ATM(double balance) {
		this.balance = balance;
	}

	// Deposit Method
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposited Successfully.");
		System.out.println("Current Balance = " + balance);
	}

	// Withdraw Method
	public void withdraw(double amount) {

		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount Withdrawn Successfully.");
			System.out.println("Current Balance = " + balance);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}

	// Check Balance Method
	public void checkBalance() {
		System.out.println("Available Balance = " + balance);
	}
}