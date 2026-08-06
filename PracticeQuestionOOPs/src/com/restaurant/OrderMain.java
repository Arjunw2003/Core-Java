package com.restaurant;

public class OrderMain {

	public static void main(String[] args) {

		Person p;

		System.err.println("==========Chef===========");
		p = new Chef(2, "Pizza");
		p.orderDetails();
		p.takeOrder();
		p.orderHandling();
		p.serveOrder();

		System.err.println("============Waiter=============");
		p = new Waiter(3, "Burger");
		p.orderDetails();
		p.takeOrder();
		p.orderHandling();
		p.serveOrder();
	}

}
