package com.movieticket;

import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== MOVIE TICKET BOOKING =====");
		System.out.println("1. Customer");
		System.out.println("2. Admin");
		System.out.print("Enter Choice : ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:

			User u;

			u = new Customer("Chava", 101);

			u.ticketDetails();
			u.bookingMode();
			u.bookTicket();
			break;

		case 2:

			u = new Admin("KGF 2", 201);

			u.ticketDetails();
			u.bookingMode();
			u.bookTicket();
			break;

		default:
			System.out.println("Invalid Choice");
		}
	}

//		User u;
//
//		System.err.println("===============Customer Ticket Booking=========");
//		u = new Customer("Chava", 12);
//		u.ticketDetails();
//		u.bookingMode();
//		u.bookTicket();
//
//		System.err.println("===========Admin Ticket Booking===============");
//		u = new Admin("Chava", 13);
//		u.ticketDetails();
//		u.bookingMode();
//		u.bookTicket();
//	}

}
