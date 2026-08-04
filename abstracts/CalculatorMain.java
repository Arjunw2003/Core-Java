package com.abstracts;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First No: ");
		int a = sc.nextInt();
		System.out.print("Enter Second No: ");
		int b = sc.nextInt();
		Calculator c;
		c = new SimpleCalculator();
		
		c.add(a, b);
		c.subtract(a, b);
		c.multiply(a, b);
		c.divide(a, b);
	}
}
