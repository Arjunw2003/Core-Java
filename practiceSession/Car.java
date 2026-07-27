package com.practiceSession;

public class Car extends Vehicle {

	public void showSpeed() {
		System.out.println("Car Speed = 80 km");
	}

	public static void main(String[] args) {

		Car car = new Car();

		car.start();
		car.showSpeed();
	}

}
