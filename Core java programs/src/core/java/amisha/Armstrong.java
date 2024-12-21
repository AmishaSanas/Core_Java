package core.java.amisha;

public class Armstrong {
	public static void main(String[] args) {
		
		int no = 153;
		int a = no;
		int r = 0;
		int sum = 0;
		
		while(a>0) {
			
			r = a % 10;// 153%10= 3,15%10=5,1%10=1
			sum	= sum + r*r*r ;//(0+3*3*3=27,27+5*5*5=152,152+1*1*1=153)=153
		    a = a/10 ;// 153/10=15, 15/10= 1,1/10=0
		    
		}
		if(sum == no) {//153==153
			
		System.out.println("it is a armstrong number");
	}
		else {
			
			System.out.println("it is not a armstrong number");
			
			}
}
}