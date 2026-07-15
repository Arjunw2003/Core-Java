package com.Ride;

import java.util.Scanner;

public class CalculateDis {
	
	public static void main(String[] args) {
		
		RideBooking rdb = new RideBooking();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Distance: ");
		double distance = sc.nextDouble();
		rdb.calculateFare(distance);
	}

}
