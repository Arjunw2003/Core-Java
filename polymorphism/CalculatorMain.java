package com.polymorphism;

public class CalculatorMain {

	public static void main(String[] args) {

//		====================================
		Calculater c = new Calculater();
		System.out.println(c.add(2, 5));
		System.out.println(c.add(4, 2, 10));

//		=====================================
		c.multiply(10, 10);
		c.multiply(20.22, 10.20);

//		=====================================
		c.area(12);
		c.area(12, 4);

//		========================================

		System.out.println(c.display(120));
		System.out.println(c.display("Arjun"));

//		================================
		c.sum(12, 10);
		c.sum(20, 10);

//		=======================
		c.show(23, "Arjun");
		c.show("Arjun", 23);
	}

}
