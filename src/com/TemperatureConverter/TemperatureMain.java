package com.TemperatureConverter;

import java.util.Scanner;

public class TemperatureMain {
	
	public static void main(String[] args) {
		
		Temperature temp = new Temperature();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Celsius: ");
		double c = sc.nextDouble();
		temp.celsiusToFahrenheit(c);
		
	}

}
