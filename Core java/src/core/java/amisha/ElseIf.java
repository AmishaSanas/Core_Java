package core.java.amisha;

public class ElseIf {

	public static void main(String[] args) {

		String loginId = "abc123@gmail.com";

		if (loginId == null) {

			System.out.println("login id is required");

		} else if (loginId != "abc@gmail.com") {

			System.out.println("invalid login id");

		} else {
			System.out.println("login successfullyy...");
		}

	}

}
