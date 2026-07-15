package com.mobileRecharge;

import java.util.Scanner;

public class Complete {
	
	public static void main(String[] args) {
		
		Recharge rec = new Recharge();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Widraw Amount: ");
		double amount = sc.nextDouble();
		rec.Recharge1(amount);
	}

}
