package com.abstracts;

public class DebitCard implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("DebitCard Pay By: " + amount);

	}

}
