package com.exc;

public class B {

	public void m1() throws ClassNotFoundException, ArithmeticException {
		
		Class.forName("java.lang.String");
		
		System.out.println(4/0);
	}
}
