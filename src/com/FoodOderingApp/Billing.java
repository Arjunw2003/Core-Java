package com.FoodOderingApp;

import java.util.Scanner;

public class Billing {
	
	public static void main(String[] args) {
		
		FoodOrder fdo = new FoodOrder();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Item: ");
		String item = sc.next();
		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();
		
		fdo.placeorder(item, quantity);
	}

}
