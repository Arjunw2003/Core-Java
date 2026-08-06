package com.bank;

public class BankMain {

	public static void main(String[] args) {

		User u;

		System.err.println("============Customer================");
		u = new Customer("Arjun", 13676474l, 2000);
		u.userDetails();
		u.checkBalance();
		u.deposit(3000);
		u.withdraw(1000);
		u.transfer(1500);
		u.checkBalance();

		System.err.println("===============Manager================");
		u = new Manager("Pavan", 646366353l, 5000);
		u.userDetails();
		u.checkBalance();
		u.deposit(4000);
		u.withdraw(2000);
		u.transfer(3000);
		u.checkBalance();
	}
}
