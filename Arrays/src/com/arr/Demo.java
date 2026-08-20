package com.arr;

public class Demo {

	public static void main(String[] args) {

		int[] arr = { 12, 56, 66, 89, 98 };

		for (int i : arr) {
			System.out.println(i);
		}

		System.out.println();

		String[] str = { "Arjun", "Kiran", "Pavan", "karan" };
		for (int i = 0; i <= str.length - 1; i++) {
			System.out.println(str[i]);
		}

		System.out.println();

		char[] ch = { 'A', '&', 'H', 'Q', 'P' };
		for (int i = 0; i <= ch.length - 1; i++) {
			System.out.println(ch[i]);
		}

		System.out.println();

		double[] d = { 23, 56.8, 78.4, 69, 48.3 };
		for (int i = 0; i <= d.length - 1; i++) {
			System.out.println(d[i]);
		}

		System.out.println();

		boolean[] b = { 45 < 40, 98 != 90, "arjun" != null };
		for (boolean c : b) {
			System.out.println(c);
		}
	}
}
