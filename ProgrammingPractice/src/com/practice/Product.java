package com.practice;

public class Product {
	
	double price;
	public Product(double price) {
		// TODO Auto-generated constructor stub
		this.price = price;
	}
	public void discount() {
		
		if (price > 1000) {
			double discount = (price * 10)/100;
			double Total = price - discount;
			System.out.println("Product Price: "+price+"Rs");
			System.out.println("Discount 10%: "+discount+"Rs");
			System.out.println("Total Price: "+Total+"Rs");
		}else {
			System.out.println("Sorry Purchase Above 1000Rs and At Up to 10% discount");
			System.out.println("Total Price: "+price+"Rs");
		}
	}

}
