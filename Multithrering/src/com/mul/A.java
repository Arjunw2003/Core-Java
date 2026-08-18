package com.mul;

public class A extends Thread {

	public void run() {
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(400);
//				Thread.currentThread();
//				Thread.dumpStack();
			} catch (Exception e) {
			}
			System.out.println(i);
		}
	}

	public void m1() {
		for (int i = 100; i >= 0; i--) {
			try {
				Thread.sleep(400);
//				Thread.currentThread();
//				Thread.dumpStack();
			} catch (Exception e) {

			}
			System.out.println(i);
		}
	}

}
