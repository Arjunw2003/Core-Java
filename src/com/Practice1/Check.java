package com.Practice1;

import java.util.Scanner;

public class Check {
	
	public static void main(String[] args) {
		
		
		
		ATM atm = new ATM();
		atm.checkBallance();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Widraw Amount: ");
		double amount = sc.nextDouble();
		
		atm.withdrawAmount(amount);
	}

}
