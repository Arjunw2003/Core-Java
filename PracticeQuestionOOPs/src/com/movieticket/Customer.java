package com.movieticket;

public class Customer extends User {

	public Customer(String movieName, int seatNo) {
		super(movieName, seatNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookTicket() {
		System.out.println("Book ticket Successfully");

	}

	@Override
	public void bookingMode() {
		System.out.println("Online Ticket Booking");

	}

}
