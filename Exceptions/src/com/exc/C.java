package com.exc;

public class C {

	public void m2() {
		B b = new B();
		try {
			b.m1();
		} catch (Exception e) {
			System.out.println("This is Not Allow");
			e.printStackTrace();
		}
	}
	
}
