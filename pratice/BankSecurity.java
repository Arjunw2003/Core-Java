package com.pratice;

public class BankSecurity extends BankAccount {

	public BankSecurity(double balance) {
		super(balance);
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			System.out.println("Deposite Successfully: " + amount);
		} else {
			System.err.println("Depsite Amount is Gretter Than zero");
		}

	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0) {
			if (amount <= getBalance()) {
				setBalance(getBalance() - amount);
				System.out.println("Withraw Successfully: " + amount);
			} else {
				System.out.println("Inssuficiese Ballance");
			}
		} else {
			System.err.println("Withdraw Amount is Gretter Than zero");
		}

	}

}
