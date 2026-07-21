package Encapsulation;

public class Product {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void discount() {

		if (price >= 1000) {
			double discount = (price * 10) / 100;
			double Total = price - discount;
			System.out.println("Product Price: " + price + "Rs");
			System.out.println("Discount 10%: " + discount + "Rs");
			System.out.println("Total Price: " + Total + "Rs");
		} else {
			System.out.println("Sorry No discount");
			System.out.println("Total Price: " + price + "Rs");
		}
	}

}
