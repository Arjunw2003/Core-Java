package Encapsulation;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Price: ");
		int price = sc.nextInt();

		Product p = new Product();
		p.setPrice(price);
		p.getPrice();
		
		p.discount();
	}
}
