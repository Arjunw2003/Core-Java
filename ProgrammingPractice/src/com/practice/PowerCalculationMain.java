package com.practice;

import java.util.Scanner;

public class PowerCalculationMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Base: ");
		int base = sc.nextInt();
		
		System.out.print("Enter Exponenet: ");
		int exponent = sc.nextInt();
		
		PowerCalculation powc = new PowerCalculation(base, exponent);
		powc.calculatePower();
	}
}
