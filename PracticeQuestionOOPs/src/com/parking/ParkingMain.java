package com.parking;

public class ParkingMain {

	public static void main(String[] args) {

		Vehicle v;

		System.err.println("=========Bike Parking==========");
		v = new Bike("MH1234", "Bike");
		v.vehicleDetails();
		v.parking();
		v.parkingCharge(3);
		v.exit();

		System.err.println("=========Car Parking==========");
		v = new Car("MH3464", "Car");
		v.vehicleDetails();
		v.parking();
		v.parkingCharge(3);
		v.exit();

		System.err.println("=========Truck Parking==========");
		v = new Truck("MH4534", "Truck");
		v.vehicleDetails();
		v.parking();
		v.parkingCharge(3);
		v.exit();
	}
}
