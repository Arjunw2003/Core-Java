package com.practiceSession;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Product Name: ");
		String prodName = sc.nextLine();

		System.out.print("Enter Product Quentity: ");
		int quantity = sc.nextInt();

		System.out.print("Enter Product Price: ");
		int price = sc.nextInt();

		Product p = new Product(prodName, quantity, price);
		System.out.println("Product Name: " + prodName);
		System.out.println("Product Quentity: " + quantity);
		System.out.println("Product Toatal Bill: " +p.calculate());

	}

}
