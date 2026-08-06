package com.parking;

public class Car extends Vehicle {

	public Car(String vehicleNo, String vehicleName) {
		super(vehicleNo, vehicleName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parking() {
		System.out.println("Parking Car");

	}

	@Override
	public void exit() {
		System.out.println("Exit Car");

	}

	@Override
	public void parkingCharge(int hours) {
		int charge = hours * 30;
		System.out.println("Car Parking Charge: " + charge);

	}

}
