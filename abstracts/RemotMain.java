package com.abstracts;

public class RemotMain {

	public static void main(String[] args) {

		RemoteControl r;

		r = new TV();
		r.powerOn();
		r.powerOff();

		r = new AC();
		r.powerOn();
		r.powerOff();
	}
}
