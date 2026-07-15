package com.Ride;

public class RideBooking {
	
	public double calculateFare(double distance) {
		
		double baseFare = 30;
		double chargePerKm = 10;
		
		double Fare = baseFare + (distance * chargePerKm);
		System.out.println("Total Fare: "+Fare);
		return Fare;
	}

}