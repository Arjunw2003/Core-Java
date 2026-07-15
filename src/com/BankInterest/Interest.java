package com.BankInterest;

public class Interest {
	
	public void calculateInterest(double principle, double rate, int time) {
		
		double Interest = (principle*rate*time);
		System.out.println("Bank Interest: "+Interest);
	}

}
