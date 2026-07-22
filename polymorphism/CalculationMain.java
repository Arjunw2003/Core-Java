package com.polymorphism;

public class CalculationMain {

	public static void main(String[] args) {

//		========================================
		Calculation c = new Calculation();
		c.calculate(4);
		c.calculate(2.0);

//		======================================

		c.max(12, 5);
		c.max(10, 5, 2);
	}
}
