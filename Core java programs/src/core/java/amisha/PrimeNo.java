package core.java.amisha;

public class PrimeNo {
	public static void main(String[] args) {

		int no = 8;

		int count = 0;//

		for (int i = 2; i < no; i++) {

			if (no % i == 0) {//8%2=0,8%3!=0,8%4=0,8%5!=0,8%6!=0,8%7!=0

				count++;//1,2,
			}
		}

		if (count == 0) {//2==0

			System.out.println("prime");

		} else {
			System.out.println("not prime");
		}

	}

}