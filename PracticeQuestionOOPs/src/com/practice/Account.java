package com.practice;

public abstract class Account implements Transaction {

	private int PIN;
	private double balance;

	public Account(int PIN, double balance) {
		this.PIN = PIN;
		this.balance = balance;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	abstract boolean security();

	public abstract void transfer(double amount);

	public void checkBalance() {
		System.out.println("Available Balance: " + balance);

	}
}
