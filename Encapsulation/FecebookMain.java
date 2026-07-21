package Encapsulation;

import java.util.Scanner;

public class FecebookMain {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("Enter UserName: ");
//		String username = sc.nextLine();
//
//		System.out.print("Enter Password: ");
//		String password = sc.nextLine();

		Facebook fc = new Facebook();
		fc.setUsername("Arjun");
		fc.setPassword("Arjun123");
//		fc.setUsername(username);
//		fc.setPassword(password);

		fc.getUsername();
		fc.getUsername();
		fc.login();
	}

}
