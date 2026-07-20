package com.practice;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Price: ");
		int price = sc.nextInt();
		
		Product pr = new Product(price);
		pr.discount();
		
	}
}
