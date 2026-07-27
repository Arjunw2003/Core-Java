package com.practiceSession;

public class Product {

	String prodName;
	int quantity;
	int price;

	public Product(String prodName, int quantity, int price) {
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;

	}

	public int calculate() {

		price = price * quantity;
		if (price > 5000) {
			int discount = (price * 10) / 100;
			System.out.println("Discount: " + discount);
			price = price - discount;
		} else {
			System.out.println("Sorry No Discount");
			return price;

		}
		return price;
	}
}
