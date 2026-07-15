package com.commerceDiscount;

import java.util.Scanner;

public class Discount1 {
	
	public static void main(String[] args) {
		
		Shop sp = new Shop();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Price: ");
		double price = sc.nextDouble();
		sp.discount(price);
	}

}
