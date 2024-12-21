package core.java.amisha;

public class TestMethod {

	public static void main(String[] args) {

		Methods m = new Methods();

		m.sum(5, 10);
		
		int multiply = m.multiply(5, 2);
		
		System.out.println(multiply);
		
		String s = m.s("hello");
		System.out.println(s);

	}
      
}
