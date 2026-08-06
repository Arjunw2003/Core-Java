package com.restaurant;

public class Chef extends Person {

	public Chef(int tableNO, String itemName) {
		super(tableNO, itemName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeOrder() {
		System.out.println("Chef Take Order");

	}

	@Override
	public void serveOrder() {
		System.out.println("Chef Serve Order to waiter");

	}

	@Override
	public void orderHandling() {
		System.out.println("Chef is Cooking order");

	}

}
