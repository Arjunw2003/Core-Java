package com.LoginSystem;

public class Login {
	
	public void login( String username, String password) {
		
		if( username == "Arjun" && password == "123") {
			
			System.out.println("Login Successfully");
		}
		else {
			System.err.println("Login faild");
		}
	}

}
