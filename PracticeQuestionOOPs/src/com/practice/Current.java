package com.practice;

public class Current extends Account {

	public Current(int PIN, double balance) {
		super(PIN, balance);
		// TODO Auto-generated constructor stub
	}

	final boolean security() {
		if (1234 == getPIN()) {

			return true;

		} else {
			return false;
		}
	}

	@Override
	public void transfer(double amount) {
		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
			System.out.println("Transfere: " + amount);
		} else {
			System.err.println("Insufficient  Balance");
		}

	}

	@Override
	public void withdraw(double amount) {
		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
			System.out.println("Withdraw Successfully: " + amount);
			System.out.println("Current Balane: " + getBalance());
		} else {
			System.err.println("Insufficient  Balance");
		}
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Deposite Successfully: " + amount);
		System.out.println("Current Balance: " + getBalance());

	}

}
