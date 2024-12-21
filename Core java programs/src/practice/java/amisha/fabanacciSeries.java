package practice.java.amisha;

public class fabanacciSeries {
	
	public static void main(String[] args) {

		int a = 0;

		int b = 1;

		int c = 0;

		for (int i = 1; i <= 10; i++) {//i=1,2,3,4,5,6,7,8,9,10

			c = a + b;//0+1=1,1+1=2,1+2=3,2+3=5,3+5=8,5+8=13,8+13=21,13+21=34,21+34=55

			System.out.print(a + " ");//0,1,1,2,3,5,8,13,21,34

			a = b;//(a=1,1,2,3,5,8,13,21,34)
			b = c;//(b=1,2,3,5,8,13,21,34,55)

		}
	}

}

