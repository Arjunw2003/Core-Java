package com.abstracts;

public class AC implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("AC On by Remote");

	}

	@Override
	public void powerOff() {
		System.out.println("AC Off By Remote");

	}

}
