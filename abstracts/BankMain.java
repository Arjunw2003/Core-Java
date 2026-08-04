package com.abstracts;

public class BankMain {

	public static void main(String[] args) {

		SBI sbi;

		System.err.println("==============SBI Bank============");
		sbi = new SBI();

		sbi.checkBalance();

		sbi.deposit(2000);
		sbi.checkBalance();
		sbi.withdraw(1000);
		sbi.checkBalance();

		System.err.println("==============HDFC Bank============");

		HDFC hdfc;
		hdfc = new HDFC();

		hdfc.checkBalance();

		hdfc.deposit(3000);
		hdfc.checkBalance();
		hdfc.withdraw(5000);
		hdfc.checkBalance();
	}
}
