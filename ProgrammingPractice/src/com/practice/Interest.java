package com.practice;

public class Interest {
	
	double principal;
	double rate;
	double time;

	public Interest(double principal, double rate, Double time) {
		// TODO Auto-generated constructor stub
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}
	
	public void calculateSI() {
		
		double SI = (principal * rate * time)/100;
		System.out.println("Simple Interest: "+SI);
	}
}
