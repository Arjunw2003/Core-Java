package com.practice;

class Cart {

	double price;
	int quantity;

	public Cart(double price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}

	public void calculateBill() {

		double total = price * quantity;

		System.out.println("Total Bill = " + total);

		if (total > 5000) {
			double discount = total * 0.10;
			double finalBill = total - discount;

			System.out.println("Discount = " + discount);
			System.out.println("Final Bill = " + finalBill);
		} else {
			System.out.println("Sorry No Discount");
			System.out.println("Final Bill = " + total);
		}
	}
}
