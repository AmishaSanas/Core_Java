package practice.java.oop.excercise;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape [3];
		
		s[0]= new Circle(2.2);
		
		s[1]= new Rectangle(5, 8);
		
		s[2] = new Triangle(3, 3);
		
		System.out.println("Total area =  " + calculateTotalArea(s));
		
	}
	
	public static double calculateTotalArea (Shape[] s) {
		
		double totalArea = 0.0;
		
		for (int i = 0; i < s.length; i++) {
			
			totalArea = totalArea + s[i].area();
			
		}
		return totalArea;

}
}
