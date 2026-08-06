package com.restaurant;

public class Waiter extends Person {

	public Waiter(int tableNO, String itemName) {
		super(tableNO, itemName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeOrder() {
		System.out.println("Waiter Take Order");

	}

	@Override
	public void serveOrder() {
		System.out.println("Waiter Serve Order To Customer");

	}

	@Override
	public void orderHandling() {
		System.out.println("Waiter Deliverd order");

	}

}
