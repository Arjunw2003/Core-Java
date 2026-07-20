package com.practice;

public class BankAccount {
	
	long accountNumber;
	double balance;
	public BankAccount(long accountNumber, double balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(){
		
		balance =+ balance;
		System.out.println("Total Ballance: "+balance);
	}
	
	public void withdraw(double withdraw) {
		if (balance >= withdraw) {
			balance = balance - withdraw;
			System.out.println("Withdraw Amount Successfully");
		}else {
			System.out.println("Insuficienc Fund");
		}
	}
	public void displayBalance() {
		System.out.println("Available Ballance: "+balance);
	}

}
