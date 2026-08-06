package com.bank;

public class Customer extends User {

	public Customer(String userName, long accountNo, double balance) {
		super(userName, accountNo, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Customer Deposite Successfully: " + amount);
		System.out.println("Current Balance: " + getBalance());

	}

	@Override
	public void withdraw(double amount) {
		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
			System.out.println("Customer Withdraw Successfully: " + amount);
			System.out.println("Saving Balane: " + getBalance());
		} else {
			System.err.println("Insufficient  Balance");
		}

	}

	@Override
	public void transfer(double amount) {
		if (amount <= getBalance()) {
			setBalance(getBalance() - amount);
			System.out.println("Customer Transfere: " + amount);
		} else {
			System.err.println("Insufficient  Balance");
		}

	}

}
