package com.practice;

import java.util.Scanner;

public class TemperatureMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Celsius: ");
		double Celsius = sc.nextDouble();
		
		TemperatureCelsius tem = new TemperatureCelsius(Celsius);
		tem.convert();
	}

}
