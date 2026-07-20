package com.practice;

public class TemperatureCelsius {
	
	double Celsius;
	public TemperatureCelsius(double Celsius) {
		// TODO Auto-generated constructor stub
		
		this.Celsius = Celsius;
	}
	
	public void convert() {
		
		double Fahrenheit = (Celsius*9/5)+32;
		System.out.println("Fahreheit: "+Fahrenheit);
	}

}
