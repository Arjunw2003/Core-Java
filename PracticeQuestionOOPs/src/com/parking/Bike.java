package com.parking;

public class Bike extends Vehicle {

	public Bike(String vehicleNo, String vehicleName) {
		super(vehicleNo, vehicleName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parking() {
		System.out.println("Parking Bike");

	}

	@Override
	public void exit() {
		System.out.println("Exit Bike");

	}

	@Override
	public void parkingCharge(int hours) {
		int charge = hours * 10;
		System.out.println("Bike Parking Charge: " + charge);

	}
}
