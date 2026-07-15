package com.Book;


// =======  Method issueBook(String bookName, boolean isAvailable).=========

public class BookIssue {
	
	public void issueBook(String bookName, boolean isAvailable) {
		
		if (isAvailable) {
			System.out.println("Book Issue Succesfully..");
		}else {
			System.out.println("Book is Not available..");
		}
	}
	
	
//	========= Method calculateTotal(double price1, double price2, double price3).=======
	
	public double calculateTotal(double price1, double price2, double price3) {
		
		double TotaleBill = (price1+price2+price3);
		System.out.println("Total Bill: "+TotaleBill);
		
		return TotaleBill;
		
	}

}
