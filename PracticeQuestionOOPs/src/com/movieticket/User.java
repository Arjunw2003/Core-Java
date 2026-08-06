package com.movieticket;

public abstract class User implements Booking {

	private String movieName;
	private int seatNo;

	public User(String movieName, int seatNo) {
		this.movieName = movieName;
		this.seatNo = seatNo;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public void ticketDetails() {
		System.out.println("Movie Name: " + movieName);
		System.out.println("Seat No: " + seatNo);
	}

	public abstract void bookingMode();

}
