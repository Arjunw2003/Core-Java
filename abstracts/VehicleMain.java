package com.abstracts;

public class VehicleMain {

	public static void main(String[] args) {

		Vehicle v;
		v = new Car();
		v.start();
		v.stop();

		v = new Bike();
		v.start();
		v.stop();
	}
}
