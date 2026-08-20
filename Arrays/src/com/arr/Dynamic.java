package com.arr;

import java.util.Scanner;

public class Dynamic {

	public static void main(String[] args) {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements....");

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}

		for (int j = 0; j <= arr.length - 1; j++) {
			int ar = arr[j];
			System.out.println(ar);
		}
	}
}
