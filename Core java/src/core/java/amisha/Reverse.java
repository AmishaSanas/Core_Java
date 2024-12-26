package core.java.amisha;

public class Reverse {
	public static void main(String[] args) {
		
		int num = 521;
		int a = num;
		int r =0;
		int sum = 0;
		
		while(a>0) {
			r = a%10;
			sum = sum*10 + r;
			a = a/10 ;
			
		}
		
		System.out.println(sum);
		
	}

}
