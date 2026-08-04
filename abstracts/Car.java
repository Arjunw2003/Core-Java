package com.abstracts;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Start Car");
	}

	@Override
	public void stop() {
		System.out.println("Stop Car");

	}

}
