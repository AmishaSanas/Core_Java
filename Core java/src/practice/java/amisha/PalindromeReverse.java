package practice.java.amisha;

public class PalindromeReverse {

	public static void main(String[] args) {

		int num = 121;
		int no = num;
		int r = 0;
		int sum = 0;

		while (no > 0) { // 121>0,12>0,1>0

			r = no % 10;// 121%10=1,12%10=2,1%10=1
			sum = (sum * 10) + r;// (0*10=0+1=1)(1*10=10+2=12) (12*10=120+1=121)
			no = no / 10;// 12,1,0
		}

		System.out.println("reverse no. " + sum);

		if (sum == num) {// 121=121

			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}
}
