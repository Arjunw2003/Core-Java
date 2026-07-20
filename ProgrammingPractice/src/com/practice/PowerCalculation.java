package com.practice;

public class PowerCalculation {

	
	int base;
	int exponent;
	
	public PowerCalculation(int base, int exponent) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.exponent = exponent;
	}
	
	void calculatePower() {
		int result = 1;
		
		for( int i = 1; i <= exponent; i++) {
			
			result = result * base;
		}
		System.out.println("Power: "+result);
	}
}
