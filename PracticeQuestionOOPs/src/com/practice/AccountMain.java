package com.practice;

public class AccountMain {

	public static void main(String[] args) {

		Account ac;

		System.err.println("================Saving Acount============");
		ac = new Savings(1234, 2000);
		if (ac.security()) {
			System.out.println("PIN Verify sucessfully");
			ac.checkBalance();
			ac.deposit(1000);
			ac.withdraw(2000);
			ac.transfer(500);
			ac.checkBalance();
		} else {
			System.err.println("Wrong PIN");
		}

		System.out.println();

		System.err.println("================Current Acount============");
		ac = new Current(1234, 4000);
		if (ac.security()) {
			System.out.println("PIN Verify sucessfully");
			ac.checkBalance();
			ac.deposit(1000);
			ac.withdraw(2000);
			ac.transfer(500);
			ac.checkBalance();
		} else {
			System.err.println("Wrong PIN");
		}
	}
}
