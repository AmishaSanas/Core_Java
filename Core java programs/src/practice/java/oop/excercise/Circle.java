package practice.java.oop.excercise;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle (double radius) {
	       this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double area = 3.14 * radius * radius;
		return area;
	}

}
