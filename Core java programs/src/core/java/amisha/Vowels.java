package core.java.amisha;

public class Vowels {
	public static void main(String[] args) {
		
		String a = "amisha";
		
		int v = 0;
		
		for(int i= 0;i < a.length(); i++){
			
		if (a.charAt(i)=='a' || a.charAt(i)=='e'|| a.charAt(i)=='i'|| a.charAt(i)=='o' || a.charAt(i)=='u') {
			
			v++;
			
		}
				
			}
		System.out.println("number of vowels = " + v);
	
		}
			
	}
		
