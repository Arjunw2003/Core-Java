package com.practice;

import java.util.Scanner;

public class PrimeNumberCheckMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		PrimeNumberCheck prime = new PrimeNumberCheck(num);
		prime.cheakPrime();

	}

}
