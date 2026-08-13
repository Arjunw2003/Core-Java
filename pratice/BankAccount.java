package com.pratice;

public abstract class BankAccount {

	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public void getbalance() {
		System.out.println("Available Balance: " + getBalance());
	}

}
