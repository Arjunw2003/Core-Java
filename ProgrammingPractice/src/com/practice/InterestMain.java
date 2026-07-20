package com.practice;

import java.util.Scanner;

public class InterestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Principal: ");
		double principal = sc.nextDouble();

		System.out.print("Enter Rate: ");
		double rate = sc.nextDouble();
		
		System.out.print("Enter Time: ");
		double time = sc.nextDouble();
		
		Interest i = new Interest(principal, rate, time);
		i.calculateSI();
	}
}
