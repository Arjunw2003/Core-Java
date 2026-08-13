package com.pratice;

//import java.util.Scanner;

public class ObjectMeth {

	public static void main(String[] args) throws InterruptedException {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter No: ");
//		int no = sc.nextInt();

//		System.out.print("Enter Name: ");
//		String name = sc.next();
//
//		System.out.print("Enter Name1: ");
//		String name1 = sc.next();
		
		int No = 1;
		int No1 = 4;
		String name = "Arjun";
		String name1 = "Arjun";
		
		System.err.println("=================Object class Method===========");
		Object ob = new Object();
		System.out.println(name.equals(name1));
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		System.out.println(ob.toString());
		System.out.println(ob.getClass());
//		ob.notify();
//		ob.notifyAll();
//		ob.wait();
//		ob.wait(No);
//		ob.wait(No, No);
		
//		
		System.err.println("========String class Method=========");
		String s = new String("Arjun");
		StringBuffer sb = new StringBuffer("Kiran");
		System.out.println(name.charAt(No));
		System.out.println(name.codePointAt(No));
		System.out.println(name.codePointBefore(No));
		System.out.println(name.codePointCount(No, No1));
		System.out.println(name.compareTo(s));
		System.out.println(name.compareToIgnoreCase(s));
		System.out.println(name.concat(s));
		System.out.println(name.contains(s));
		System.out.println(name.contentEquals(s));
		System.out.println(name.contentEquals(sb));
		System.out.println(name.toCharArray());
		
	}
}
