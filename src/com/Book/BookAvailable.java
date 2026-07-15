package com.Book;

import java.util.Scanner;

public class BookAvailable {
	
	public static void main(String[] args) {
		
		BookIssue bk = new BookIssue();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Name: ");
		String bookName = sc.nextLine();
		
		System.out.print("Enter Book Available: ");
		boolean isAvailable = sc.nextBoolean();
		
		bk.issueBook(bookName, isAvailable);
		
		
//		=============================================
		
		System.out.print("Enter Price1: ");
		double price1 = sc.nextDouble();
		System.out.print("Enter Price2: ");
		double price2 = sc.nextDouble();
		System.out.print("Enter Price3: ");
		double price3 = sc.nextDouble();
		bk.calculateTotal(price1, price2, price3);
	}
	
	

}
