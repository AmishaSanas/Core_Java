package practice.java.amisha;

import java.util.Random;

public class RandomNo {
	
	public static void main(String[] args) {
		
			
			 Random r = new Random();
			
			for (int i = 1; i <= 5; i++) {

				int n = r.nextInt(100);

				System.out.println(n);	
	}		
  }
}
	