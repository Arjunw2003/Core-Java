package com.practiceSession;

public class BankAccount {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println(amount + "Deposited Successfully");
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println(amount + " Withdrawn Successfully.");
		} else {
			System.out.println("Insufficient Balance.");
		}
	}

}
