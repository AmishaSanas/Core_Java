package practice.java.amisha;

public class SumOfInteger100to200 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 101; i < 200; i++) {

			if (i % 7 == 0) {// 7/105=0,7/112=0,7/119=0

				System.out.println(i);

				sum = sum + i;//0+105=105,

			}
		}

		System.out.println("sum = " + sum);

	}

}

