package com.abstracts;

public class PaymentMain {

	public static void main(String[] args) {

		Payment p;
		p = new UPI();
		p.pay(2000);

		p = new CreditCard();
		p.pay(15000);

		p = new DebitCard();
		p.pay(50000);
	}
}
