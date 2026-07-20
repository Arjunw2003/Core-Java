package com.practice;

import java.util.Scanner;

public class CartMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Item Price: ");
		double price = sc.nextDouble();

		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();

		Cart c = new Cart(price, quantity);

		c.calculateBill();

		sc.close();
	}
}