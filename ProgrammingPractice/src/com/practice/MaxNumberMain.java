package com.practice;

import java.util.Scanner;

public class MaxNumberMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Num1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Num2: ");
		int num2 = sc.nextInt();
		System.out.print("Enter Num3: ");
		int num3 = sc.nextInt();

		MaxNumber maxno = new MaxNumber(num1, num2, num3);

		maxno.findMax();
	}
}
