package com.abstracts;

public class HDFC implements Bank {

	double balance = 5000;

	@Override
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount Deposited = " + amount);

	}

	@Override
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount Withdrawn = " + amount);
		} else {
			System.out.println("Insufficient Balance");
		}

	}

	@Override
	public void checkBalance() {
		System.out.println("HDFC Balance = " + balance);

	}

}
