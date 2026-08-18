package com.exc;

public class Demo {

	public void m1() {
		int a = 5;
		int b = 0;
		if (b == 0) {
			throw new arjunException("This is not allow");
		}
		System.out.println(a/b);
	}
}
