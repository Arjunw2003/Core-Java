package com.practice;

import java.util.Scanner;

public class BankAccountMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Deposit Amount: ");
		double ballance = sc.nextDouble();
		
		BankAccount bk = new BankAccount(0, ballance);
		bk.deposit();
		
		System.out.print("Enetr Withdraw Ammount: ");
		double withdraw = sc.nextDouble();
		
		bk.withdraw(withdraw);
		
		bk.displayBalance();
	}

}
