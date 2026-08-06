package com.parking;

public abstract class Vehicle implements Parking {

	private String vehicleNo;
	private String vehicleName;

	public Vehicle(String vehicleNo, String vehicleName) {
		this.vehicleNo = vehicleNo;
		this.vehicleName = vehicleName;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public void vehicleDetails() {
		System.out.println("Vehicle No: " + vehicleNo);
		System.out.println("Vehicle Name: " + vehicleName);
	}

	public abstract void parkingCharge(int hours);
}
