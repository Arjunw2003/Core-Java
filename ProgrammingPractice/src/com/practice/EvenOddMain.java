package com.practice;

import java.util.Scanner;

public class EvenOddMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num: ");
		int num = sc.nextInt();
		
		EvenOdd e = new EvenOdd(num);
		e.cehck();
	}
}
