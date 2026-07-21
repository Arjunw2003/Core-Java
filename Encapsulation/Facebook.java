package Encapsulation;

public class Facebook {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void login() {
		if (username == "Arjun" && password == "Arjun123") {
			System.out.println("Login Successfully");
		} else {
			System.out.println("Invalid Username & Password");
		}
	}

}
