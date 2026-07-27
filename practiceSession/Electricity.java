package com.practiceSession;

public class Electricity {

	public void calculateElectricityBill(int units) {

		if (units <= 100) {
			double ElecetricityBill = units * 5;
			System.out.println("Electricity Bill: " + ElecetricityBill);
		} else if (units > 100) {
			double ElecetricityBill = units * 7;
			System.out.println("Electricity Bill: " + ElecetricityBill);
		} else if (units >= 200) {
			double ElecetricityBill = units * 10;
			System.out.println("Electricity Bill: " + ElecetricityBill);

		}

	}

}
