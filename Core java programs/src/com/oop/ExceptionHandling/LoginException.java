package com.oop.ExceptionHandling;

public class LoginException extends Exception {//checked

	public LoginException() {

		super("Access Denied");
	}

	public static void main(String[] args) {

		String userid = "ABC1234";

		if (userid != "ABC123") {

			try {
				throw new LoginException();
			} catch (LoginException e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}

		} else {
			System.out.println("Valid login");

		}
	}
}
