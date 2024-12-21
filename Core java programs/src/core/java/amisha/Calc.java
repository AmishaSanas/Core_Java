package core.java.amisha;

public class Calc {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		String opr = "*";

		switch (opr) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		default:
			System.out.println("no one case is exucted");
			break;
		}

	}

}
