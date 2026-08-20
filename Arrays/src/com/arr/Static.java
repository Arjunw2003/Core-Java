package com.arr;

public class Static {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 67, 89, 56 };
		String[] str = { "Arjun", "Kiran", "Om", "Pavan", "Ramesh" };

//		Static
//		Without For Loop
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		System.out.println("=============");

//		With For lopp
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==============");

//		With ForEach Loop
		for (int i : arr) {
			System.out.println(i);
		}

		System.out.println("===============");

		for (int i = 0; i <= str.length - 1; i++) {
			System.out.println(str[i]);
		}

		System.out.println("==============");

//		Reverse Array String Elements
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i]);
		}

		System.out.println("=============");

//		Reverse Array integer Elements
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
