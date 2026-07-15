package com.BankInterest;

import java.util.Scanner;

public class Result {
	
	public static void main(String[] args) {
		
		
		Interest it = new Interest();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Priciple: ");
		double principle = sc.nextDouble();
		System.out.print("Enter Rate: ");
		double rate = sc.nextDouble();
		System.out.print("Enter Time: ");
		int time = sc.nextInt();
		
		it.calculateInterest(principle, rate, time);
		
	}

}
