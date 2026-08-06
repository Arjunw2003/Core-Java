package com.movieticket;

public class Admin extends User {

	public Admin(String movieName, int seatNo) {
		super(movieName, seatNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookTicket() {
		System.out.println("Book Ticket Sucessfully");

	}

	@Override
	public void bookingMode() {
		System.out.println("Offline ticket Booking");

	}

}
