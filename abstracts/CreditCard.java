package com.abstracts;

public class CreditCard implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("CreditCard Pay By: " + amount);

	}

}
