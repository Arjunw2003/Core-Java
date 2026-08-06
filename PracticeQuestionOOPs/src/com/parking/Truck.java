package com.parking;

public class Truck extends Vehicle {

	public Truck(String vehicleNo, String vehicleName) {
		super(vehicleNo, vehicleName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parking() {
		System.out.println("Parking Truck");

	}

	@Override
	public void exit() {
		System.out.println("Exit Truck");

	}

	@Override
	public void parkingCharge(int hours) {
		int charge = hours * 50;
		System.out.println("Truck Parking Charge: " + charge);

	}
}
