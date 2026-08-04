package com.abstracts;

public class TV implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("TV On by Remote");

	}

	@Override
	public void powerOff() {
		System.out.println("TV Off by Remote");

	}

}
