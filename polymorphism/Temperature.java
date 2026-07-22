package com.polymorphism;

public class Temperature {

	public void convert(int celsius) {
		double Fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println("Faherenheit: " + Fahrenheit);
	}

	public void convert(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Faherenheit: " + celsius);
	}
}
